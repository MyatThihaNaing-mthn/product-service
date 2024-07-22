package com.thiha.sneakershop.productserivce.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class ProductOverview {
    private UUID id;
    private String brand;
    private String name;
    private String imageUrl;
    private double price;
}
