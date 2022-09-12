package com.arya.commsult.service;

import com.arya.commsult.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public Product save(Product product);

    List< Product > getAllProduct();

    Optional< Product > getProductById(Integer id);

    public void removeOne(Integer id);
}
