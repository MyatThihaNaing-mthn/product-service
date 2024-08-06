package com.thiha.sneakershop.productserivce.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thiha.sneakershop.productserivce.dto.ProductCreationDto;
import com.thiha.sneakershop.productserivce.dto.ProductDetailsDto;
import com.thiha.sneakershop.productserivce.dto.ProductOverview;
import com.thiha.sneakershop.productserivce.mapper.ProductMapper;
import com.thiha.sneakershop.productserivce.model.Brand;
import com.thiha.sneakershop.productserivce.model.Product;
import com.thiha.sneakershop.productserivce.repository.BrandRepository;
import com.thiha.sneakershop.productserivce.repository.ProductRepository;
import com.thiha.sneakershop.productserivce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public ProductDetailsDto getProductById(UUID id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return ProductMapper.mapToProductDetailsDto(product.get());
        }
        return null;
    }

    @Override
    public List<ProductOverview> getAllProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    @Override
    public ProductDetailsDto createNewProduct(ProductCreationDto productRequest) {
        Product newProduct = new Product();
        
        Optional<Brand> brand = brandRepository.getBrandByName(productRequest.getBrand());
        // TODO throw proper exception
        if(!brand.isPresent()){
            throw new RuntimeException("Brand not found");
        }
        newProduct.setBrand(brand.get());
        newProduct.setColor(productRequest.getColor());
        newProduct.setDescription(productRequest.getDescription());
        newProduct.setDiscount(productRequest.getDicount());
        // TODO Implement image upload service 
        newProduct.setImageUrls(null);
        newProduct.setName(productRequest.getName());
        newProduct.setPrice(productRequest.getPrice());
        newProduct.setQuantity(productRequest.getQuantity());
        newProduct.setSizeInUS(productRequest.getSizeInUS());

        Product savedProduct = productRepository.save(newProduct);
        return ProductMapper.mapToProductDetailsDto(savedProduct);
    }

    @Override
    public ProductDetailsDto updateExistingProduct(UUID productId, ProductCreationDto updateProduct) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateExistingProduct'");
    }
    
}
