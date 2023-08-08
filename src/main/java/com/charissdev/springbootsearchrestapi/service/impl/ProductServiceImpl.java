package com.charissdev.springbootsearchrestapi.service.impl;

import com.charissdev.springbootsearchrestapi.dto.ProductDto;
import com.charissdev.springbootsearchrestapi.entity.Product;
import com.charissdev.springbootsearchrestapi.repository.ProductRepository;
import com.charissdev.springbootsearchrestapi.service.ProductInterface;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductInterface {

    private final ProductRepository productRepository;
    private final ModelMapper mapper;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = mapper.map(productDto, Product.class);
        Product createdProduct = productRepository.save(product);
        return mapper.map(createdProduct, ProductDto.class);
    }
}
