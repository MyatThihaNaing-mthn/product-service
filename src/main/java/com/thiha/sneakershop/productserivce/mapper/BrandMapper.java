package com.thiha.sneakershop.productserivce.mapper;

import com.thiha.sneakershop.productserivce.model.Brand;
import com.thiha.sneakershop.productserivce.model.BrandDto;

public class BrandMapper {
   public static BrandDto maptoBrandDto(Brand brand){
    BrandDto brandDto = new BrandDto();
    brandDto.setId(brand.getId().toString());
    brandDto.setBrandName(brand.getBrandName());
    return brandDto;
   }
}
