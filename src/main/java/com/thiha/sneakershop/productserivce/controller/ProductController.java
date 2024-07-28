package com.thiha.sneakershop.productserivce.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiha.sneakershop.productserivce.dto.ProductOverview;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @GetMapping
    public ResponseEntity<?> getProduct(){
        ProductOverview productOverview = new ProductOverview();
        productOverview.setId(UUID.randomUUID());
        productOverview.setBrand("Nike");
        productOverview.setImageUrl("productImageUrl");
        productOverview.setPrice(200);
        productOverview.setName("AirMax");

        return new ResponseEntity<>(productOverview, HttpStatus.OK);
    }
}
