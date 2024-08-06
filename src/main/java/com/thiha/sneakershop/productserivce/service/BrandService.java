package com.thiha.sneakershop.productserivce.service;

import com.thiha.sneakershop.productserivce.dto.BrandCreationDto;
import com.thiha.sneakershop.productserivce.model.BrandDto;

public interface BrandService {
    BrandDto createBrand(BrandCreationDto request);
}
