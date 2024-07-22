package com.thiha.sneakershop.productserivce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiha.sneakershop.productserivce.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, String>{
    
}
