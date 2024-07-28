package com.thiha.sneakershop.productserivce.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiha.sneakershop.productserivce.model.ProductImage;

public interface ProductImageRepository extends JpaRepository<ProductImage, UUID> {
    
}
