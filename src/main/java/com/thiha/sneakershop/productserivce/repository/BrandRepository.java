package com.thiha.sneakershop.productserivce.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.thiha.sneakershop.productserivce.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, UUID>{
    @Query("""
            SELECT b
            FROM Brand b
            WHERE b.brandName = :name
            """)
   Optional<Brand> getBrandByName(@Param("name")String name);
}
