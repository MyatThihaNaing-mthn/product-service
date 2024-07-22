package com.thiha.sneakershop.productserivce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiha.sneakershop.productserivce.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
    
}
