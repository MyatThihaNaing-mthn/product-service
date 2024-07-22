package com.thiha.sneakershop.productserivce.dto;

import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ProductCreationDto {
    private String name;
    private String brand;
    private String description;
    private String color;
    private double price;
    private double dicount;
    private int sizeInUS;
    private int quantity;
    private Set<MultipartFile> imageFiles;
}
