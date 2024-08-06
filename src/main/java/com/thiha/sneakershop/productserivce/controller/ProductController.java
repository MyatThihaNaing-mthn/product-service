package com.thiha.sneakershop.productserivce.controller;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiha.sneakershop.productserivce.dto.BrandCreationDto;
import com.thiha.sneakershop.productserivce.dto.ProductCreationDto;
import com.thiha.sneakershop.productserivce.dto.ProductDetailsDto;
import com.thiha.sneakershop.productserivce.model.BrandDto;
import com.thiha.sneakershop.productserivce.service.BrandService;
import com.thiha.sneakershop.productserivce.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private BrandService brandService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable UUID id){
        ProductDetailsDto product = productService.getProductById(id);
        if(product == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ProductDetailsDto> createProduct(@ModelAttribute ProductCreationDto productRequest){
        // TODO implement validation
        ProductDetailsDto product = productService.createNewProduct(productRequest);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @PostMapping("/brand")
    public ResponseEntity<BrandDto> createNewBrand(@RequestBody BrandCreationDto brandRequest){
        BrandDto brandDto = brandService.createBrand(brandRequest);
        return new ResponseEntity<>(brandDto, HttpStatus.CREATED);
    }
}
