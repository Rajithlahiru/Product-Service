package com.vortex.microservices.product.repository;

import com.vortex.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
    
}
