package edu.iect.service;

import edu.iect.dto.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    List<Product> getAll();

    void updateProduct(Product product);

}
