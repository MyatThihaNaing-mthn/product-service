package com.thiha.sneakershop.productserivce.dto;

import java.util.Set;
import java.util.UUID;

import com.thiha.sneakershop.productserivce.model.Brand;

import lombok.Data;

@Data
public class ProductDetailsDto {
    private UUID id;
    private String name;
    private Brand brand;
    private String description;
    private String color;
    private double price;
    private double discount;
    private int sizeInUS;
    private int quantity;
    private Set<String> imageUrls;
}
