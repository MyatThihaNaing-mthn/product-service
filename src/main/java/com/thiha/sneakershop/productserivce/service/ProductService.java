package com.thiha.sneakershop.productserivce.service;

import java.util.List;
import java.util.UUID;
import com.thiha.sneakershop.productserivce.dto.ProductCreationDto;
import com.thiha.sneakershop.productserivce.dto.ProductDetailsDto;
import com.thiha.sneakershop.productserivce.dto.ProductOverview;

public interface ProductService {
    ProductDetailsDto getProductById(UUID id);
    List<ProductOverview> getAllProducts();
    ProductDetailsDto createNewProduct(ProductCreationDto productRequest);
    ProductDetailsDto updateExistingProduct(UUID productId, ProductCreationDto updateProduct);
}
