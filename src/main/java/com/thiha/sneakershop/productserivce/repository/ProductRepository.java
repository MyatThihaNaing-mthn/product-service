package com.thiha.sneakershop.productserivce.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiha.sneakershop.productserivce.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    
}
