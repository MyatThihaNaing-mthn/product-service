package com.thiha.sneakershop.productserivce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiha.sneakershop.productserivce.dto.BrandCreationDto;
import com.thiha.sneakershop.productserivce.mapper.BrandMapper;
import com.thiha.sneakershop.productserivce.model.Brand;
import com.thiha.sneakershop.productserivce.model.BrandDto;
import com.thiha.sneakershop.productserivce.repository.BrandRepository;
import com.thiha.sneakershop.productserivce.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public BrandDto createBrand(BrandCreationDto request) {
        Brand brand = new Brand();
        brand.setBrandName(request.getBrandName());
        brand.setProducts(null);
        Brand savedBrand = brandRepository.save(brand);
        return BrandMapper.maptoBrandDto(savedBrand);
    }
    
}
