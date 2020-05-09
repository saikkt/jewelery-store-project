package com.eCommerce.jewelrystore.products.exceptions;

public class ProductOutOfStockException extends RuntimeException{
    public ProductOutOfStockException(String msg){
        super(msg);
    }
}
