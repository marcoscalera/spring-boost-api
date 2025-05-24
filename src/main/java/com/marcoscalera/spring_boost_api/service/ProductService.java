package com.marcoscalera.spring_boost_api.service;

import com.marcoscalera.spring_boost_api.model.Product;
import com.marcoscalera.spring_boost_api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // GET ALL THE PRODUCT
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    // GET PRODUCT BY ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // GET PRODUCTS BY CATEGORY
    public List<Product> getProductByCategory(String categoryName) {
        return productRepository.findProductByCategory(categoryName);
    }

    public List<Product> getProductsByPriceLessThanEqual(Double price) {
        return productRepository.findProductByPriceLessThanEqual(price);
    }

    public List<Product> getProductsByProductName(String name) {
        return productRepository.findProductByNameContainingIgnoreCase(name);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }
}

