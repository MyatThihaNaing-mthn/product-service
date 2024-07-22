package com.thiha.sneakershop.productserivce.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product_images")
public class ProductImage {
    @Id
    @GeneratedValue
    private UUID id;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
