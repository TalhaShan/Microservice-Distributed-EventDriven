package com.bootcamp4.productservice.repository;

import com.bootcamp4.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
