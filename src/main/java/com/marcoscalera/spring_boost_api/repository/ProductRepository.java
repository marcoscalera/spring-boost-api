package com.marcoscalera.spring_boost_api.repository;

import com.marcoscalera.spring_boost_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // FIND PRODUCY BY CATEGORY
    List<Product> findProductByCategory(String name);

    // FIND PRODUCTS WITH PRICE LESS OR EQUAL TO MAXPRICE
    List<Product> findProductByPriceLessThanEqual(Double maxprice);

    // FIND PRODUCTS CONTAINING NAME
    List<Product> findProductByNameContainingIgnoreCase(String name);

}
