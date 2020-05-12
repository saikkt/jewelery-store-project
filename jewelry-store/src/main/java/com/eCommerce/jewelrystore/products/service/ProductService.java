package com.eCommerce.jewelrystore.products.service;

import com.eCommerce.jewelrystore.products.global.filters.ProductSpecification;
import com.eCommerce.jewelrystore.products.global.filters.SearchCriteria;
import com.eCommerce.jewelrystore.products.global.globalmodel.CategoryType;
import com.eCommerce.jewelrystore.products.global.globalmodel.ProductGlobalModel;
import com.eCommerce.jewelrystore.products.global.globalmodel.pricefilter.FacetFilter;
import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.model.Collection;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.repositories.CategoryRepository;
import com.eCommerce.jewelrystore.products.repositories.CollectionsRepository;
import com.eCommerce.jewelrystore.products.repositories.ProductsRepository;
import com.eCommerce.jewelrystore.products.repositories.SectionsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.*;

@Service
public class ProductService {


    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    SectionsRepository sectionsRepository;
    @Autowired
    CollectionsRepository collectionsRepository;
    @Autowired
    CategoryService categoryService;
    @Autowired
    MaterialService materialService;
    @Autowired
    MetalPurityService metalPurityService;
    @Autowired
    DiscountService discountService;
    @Autowired
    SectionService sectionService;
    @Autowired
    SubCategoryService subCategoryService;

    Logger logger = LoggerFactory.getLogger(ProductService.class);

    public Product getByProductID(long productID){
        return productsRepository.findByProductID(productID);
    }

    public List<Product> getProducts(){
        List<Product> products = null;
        try {
            products = productsRepository.findAll();
        }
        catch (Exception e){
           logger.error("Exception reading data from Products table "+e);
        }
        return products;
    }

    public List<Product> getProductByCategory(String categoryName){
        List<Product> product=null;
        try {
            Optional<Category> category = Optional.of(categoryRepository.findByCategoryName(categoryName));
            if(!category.isPresent())
            {
                logger.info("Category does not exists "+categoryName);
                return null;
            }
            product = productsRepository.findByCategoryID(category.get().getCategoryID());
        }
        catch(Exception e){
            logger.error("Exception reading data from Products table by Category "+e);
        }
        return product;
    }

    public List<Product> getProductByCollection(String collectionName){
        List<Product> product=null;
        try {
            Optional<Collection> collection = collectionsRepository.findByCollectionName(collectionName);
            if(!collection.isPresent())
            {
                logger.info("Collection does not exists "+collectionName);
                return null;
            }
            product = productsRepository.findByCollectionID(collection.get().getCollectionID());
        }
        catch(Exception e){
            logger.error("Exception reading data from Products table by Collection "+e);
        }
        return product;
    }

    public List<Product> getProductBySection(String sectionName){
        List<Product> product=null;
        try {
            Optional<Section> section = sectionsRepository.findBySectionName(sectionName);
            if(!section.isPresent())
            {
                logger.info("Section does not exists "+sectionName);
                return null;
            }
            product = productsRepository.findBySectionID(section.get().getSectionID());
        }
        catch(Exception e){
            logger.error("Exception reading data from Products table by Section "+e);
        }
        return product;
    }

    public Product saveProduct(Product product){
        Product savedProduct = null;
        try{
        savedProduct = productsRepository.save(product);
        }
        catch(Exception e){
            logger.error("Could not save the product with name "+product.getProductName()+"  "+e);
        }
        return savedProduct;
    }

    public List<Product> saveProducts(List<Product> products){
        List<Product> savedProducts = productsRepository.saveAll(products);
        return savedProducts;
    }


    public void deleteProduct(long productId){
        Product product=productsRepository.findByProductID(productId);
        productsRepository.delete(product);
    }

    public List<Product> getLatestThreeProducts() {
        return productsRepository.findProductsByLatestDate();
    }

    public List<Product> getAllProductsPageable(ProductGlobalModel productGlobalModel,int pageNumber, int totalPages) {

        HashMap<String, Set<Long>> filters = new HashMap<>();
        HashMap<String, List<FacetFilter>> facets = (HashMap<String, List<FacetFilter>>) productGlobalModel.getFacets();


        //getting the enabled filters into hashmap
        Set<Specification> specifications = new HashSet<>();
        facets.entrySet().stream().forEach((p -> {
            specifications.add(check(p));
        }));

        //building the specification to filter the search
        Specification finalSpec = null;
        for (Specification spec : specifications) {
            finalSpec = Specification.where(finalSpec).and(spec);
        }

        //checking for price filter
        if (facets.get("price-filter") != null) {
            BigDecimal min_price, max_price;
            List<FacetFilter> priceFilter = facets.get("price-filter");
            min_price = (BigDecimal) priceFilter.get(0).getMin_price();
            max_price = (BigDecimal) priceFilter.get(0).getMax_price();
            ProductSpecification spec = new ProductSpecification(new SearchCriteria("price", "<>", min_price, max_price));
            finalSpec = Specification.where(finalSpec).and(spec);
        }

        Pageable pageable;
        if (productGlobalModel.getSortBy() != null) {
            Sort sort = Sort.by("productName").descending();
            List<FacetFilter> facetSortFilters = productGlobalModel.getSortBy();
            for (FacetFilter f : facetSortFilters) {
                if (f.isEnabled()) {
                    sort=null;
                    switch (f.getName()) {
                        case "discount":
                            sort = Sort.by(Sort.Order.desc("discount"));
                            break;
                        case "price low to high":
                            System.out.println("here");
                            sort = Sort.by(Sort.Order.asc("price"));
                            break;
                        case "Price high to low":
                            System.out.println("here");
                            sort = Sort.by(Sort.Order.desc("price"));
                            break;
                        case "new listed":
                            sort = Sort.by(Sort.Order.desc("createDate"));
                            break;
                        default:
                        	sort = Sort.by(Sort.Order.desc("createDate"));
                        	break;
                    }

                }
            }

            pageable = PageRequest.of(pageNumber, totalPages, sort);
        } else
            pageable = PageRequest.of(pageNumber, totalPages);
        return productsRepository.findAll(finalSpec, pageable).getContent();
    }

    public Specification getPredicate(String filterName,Set<Long> filters){
        Specification returnSpec = null;
        for(Long i:filters){
            ProductSpecification productSpecification = new ProductSpecification(new SearchCriteria(filterName,":",i));
            System.out.println(filterName+i);
            returnSpec = Specification.where(returnSpec).or(productSpecification);
        }
        return returnSpec;
    }

    public Specification check(Map.Entry p){

        Set<Long> returnFilterSet = new HashSet<>();
        Specification returnPredicate = null;
        List<FacetFilter> facetFilters;
        switch ((String)p.getKey()){

            //category filter
            case "category-filter":
                facetFilters = (List<FacetFilter>) p.getValue();
                System.out.println(facetFilters.get(0).getClass());
                facetFilters.stream().filter(a->a.isEnabled()==true).forEach(l->{
                    returnFilterSet.add(categoryService.getCategoryByName(l.getName()).getCategoryID());
                                   });
                returnPredicate = getPredicate("categoryID",returnFilterSet);
            break;

            //sub-category-filter
            case "sub-category-filter":
                facetFilters = (List<FacetFilter>) p.getValue();
                System.out.println(facetFilters.get(0).getClass());
                facetFilters.stream().filter(a->a.isEnabled()==true).forEach(l->{
                    returnFilterSet.add(subCategoryService.getBySubCategoryName(l.getName()).getSubCategoryID());
                });
                returnPredicate = getPredicate("subCategoryID",returnFilterSet);
                break;

            //gender-filter
            case "gender":
                facetFilters = (List<FacetFilter>) p.getValue();
                facetFilters.stream().filter(a->a.isEnabled()==true).forEach(l->{
                    returnFilterSet.add(sectionService.getSectionByName(l.getName()).getSectionID());
                });
                returnPredicate = getPredicate("sectionID",returnFilterSet);
                break;

            //materials-filter
            case "materials":
                facetFilters = (List<FacetFilter>) p.getValue();
                facetFilters.stream().filter(a->a.isEnabled()==true).forEach(l->{
                    returnFilterSet.add(materialService.getByMaterialType(l.getName()).getMaterialID());
                });
                returnPredicate = getPredicate("materialID",returnFilterSet);
                break;

            //metal-purity-filter
            case "materials_purity":
                facetFilters = (List<FacetFilter>) p.getValue();
                facetFilters.stream().filter(a->a.isEnabled()==true).forEach(l->{
                    returnFilterSet.add(metalPurityService.findByPurity(l.getName()).getMetalPurityID());
                });
                returnPredicate = getPredicate("metalPurityID",returnFilterSet);
                break;

            //discount-filter
            case "discount":
                facetFilters = (List<FacetFilter>) p.getValue();
                facetFilters.stream().filter(a->a.isEnabled()==true).forEach(l->{
                    returnFilterSet.add(discountService.findByDiscountType(l.getName()).getDiscountID());
                });
                returnPredicate = getPredicate("discountID",returnFilterSet);
                break;

        }
        return returnPredicate;
    }


    public List<Product> searchProductByKeyWord(String keyword) {
        return productsRepository.findByProductKeyWord(keyword);
    }
}
