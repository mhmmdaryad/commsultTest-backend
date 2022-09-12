package com.arya.commsult.service;

import com.arya.commsult.model.Product;
import com.arya.commsult.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Optional< Product > getProductById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public List< Product > getAllProduct() {
        return (List< Product >) productRepository.findAll();
    }

    public void removeOne(Integer id) {
        productRepository.deleteById(id);
    }

}
