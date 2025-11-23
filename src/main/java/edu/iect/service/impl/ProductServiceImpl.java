package edu.iect.service.impl;

import edu.iect.dto.Product;
import edu.iect.entity.ProductEntity;
import edu.iect.repository.ProductRepository;
import edu.iect.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public void addProduct(Product product) {
        ProductEntity entity = modelMapper.map(product, ProductEntity.class);
        productRepository.save(entity);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, Product.class))
                .collect(Collectors.toList());
    }

    @Override
    public void updateProduct(Product product) {
        // Update will work with save() if ID exists
        ProductEntity entity = modelMapper.map(product, ProductEntity.class);
        productRepository.save(entity);
    }
}

