package com.thiha.sneakershop.productserivce.mapper;

import java.util.stream.Collectors;
import java.util.Set;
import java.util.Optional;
import com.thiha.sneakershop.productserivce.dto.ProductDetailsDto;
import com.thiha.sneakershop.productserivce.dto.ProductOverview;
import com.thiha.sneakershop.productserivce.model.Product;
import com.thiha.sneakershop.productserivce.model.ProductImage;

public class ProductMapper {
    public static ProductDetailsDto mapToProductDetailsDto(Product product){
        ProductDetailsDto productDetails = new ProductDetailsDto();
        productDetails.setId(product.getId());
        productDetails.setName(product.getName());
        productDetails.setBrand(product.getBrand().getBrandName());
        productDetails.setColor(product.getColor());
        productDetails.setDescription(product.getDescription());
        productDetails.setDiscount(product.getDiscount());
        productDetails.setPrice(product.getPrice());
        productDetails.setDiscount(product.getDiscount());
        productDetails.setQuantity(product.getQuantity());
        productDetails.setSizeInUS(product.getSizeInUS());
        // TODO refactor after implementing image upload service
        if(product.getImageUrls() != null){
            productDetails.setImageUrls(
            product.getImageUrls().stream().map(
                productImage -> productImage.getImageUrl()
                )
                .collect(Collectors.toSet()));
        }else{
            productDetails.setImageUrls(null);
        }
        return productDetails;

    }

    public static ProductOverview mapToProductOverview(Product product){
        ProductOverview overview = new ProductOverview();
        overview.setId(product.getId());
        overview.setBrand(product.getBrand().getBrandName());
        overview.setName(product.getName());
        overview.setPrice(product.getPrice());
        Set<ProductImage> images = product.getImageUrls();
        Optional<ProductImage> optionalImage = images.stream().findFirst();
        if(optionalImage.isPresent()){
            overview.setImageUrl(optionalImage.get().getImageUrl());
        }else{
            overview.setImageUrl(null);
        }
        return overview;
    }
}
