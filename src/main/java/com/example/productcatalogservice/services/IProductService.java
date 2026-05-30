package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.Product;

public interface IProductService {

    Product getProductById(Long id);

    Product replaceProduct(Long id, Product product);
}
