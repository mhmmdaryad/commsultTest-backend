package com.arya.commsult.repository;

import com.arya.commsult.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository< Product, Integer > {

    void findById(int id);
}
