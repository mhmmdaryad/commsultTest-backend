package com.arya.commsult.controller;

import com.arya.commsult.model.Product;
import com.arya.commsult.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List< Product > getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Optional< Product > getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public String add(@RequestBody Product product) {
        productService.save(product);
        return "New Product Added";
    }

    @PutMapping("/{id}")
    public Product update(@RequestBody Product product, @PathVariable Integer id) {
        product.setId(id);
        return productService.save(product);
    }


    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Integer id) {
        productService.removeOne(id);
    }
}
