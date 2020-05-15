package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Integer>, JpaSpecificationExecutor<Product> {

//    @QueryHints(value = { @QueryHint(name = org.hibernate.annotations.QueryHints.FLUSH_MODE, value = "COMMIT") })
    Product findByProductID(long productID);
    List<Product> findByCategoryID(long categoryID);
    List<Product> findByCollectionID(long collectionID);
    List<Product> findBySectionID(long sectionID);

    @Query(value = "select * from jProducts p order by p.CreateDate DESC LIMIT 3",nativeQuery = true)
    List<Product> findProductsByLatestDate();

    Page<Product> findAll(Pageable pageable);

    @Query(value = "select * from jProducts p where upper(p.ProductName) like upper(concat('%', ?1,'%')) order by p.CreateDate DESC",nativeQuery = true)
    List<Product> findByProductKeyWord(String keyword);
}
