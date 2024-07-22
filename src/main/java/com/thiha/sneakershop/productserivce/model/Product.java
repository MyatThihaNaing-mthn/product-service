package com.thiha.sneakershop.productserivce.model;


import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

/*
 * The product will only be sneaker for now
 */
@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String brand;
    private String description;
    private String color;
    private double price;
    private double discount;
    private int sizeInUS;
    private int quantity;

    @OneToMany(mappedBy = "product")
    private Set<ProductImage> imageUrls;
}
