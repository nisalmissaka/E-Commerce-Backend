package edu.iect.controller;

import edu.iect.dto.Product;
import edu.iect.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/product")
@CrossOrigin
public class ProductController {

    private final ProductService service;

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
}
