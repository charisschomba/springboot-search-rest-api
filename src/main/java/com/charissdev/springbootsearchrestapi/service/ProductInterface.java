package com.charissdev.springbootsearchrestapi.service;

import com.charissdev.springbootsearchrestapi.dto.ProductDto;
import com.charissdev.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductInterface {
    List<Product> searchProducts(String query);
    ProductDto createProduct(ProductDto productDto);
}
