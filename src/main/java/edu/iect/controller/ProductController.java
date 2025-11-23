package edu.iect.controller;

import edu.iect.dto.Product;
import edu.iect.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("product")
@CrossOrigin(origins = "https://localhost:5174")
public class ProductController {

     final ProductService service;

    @PostMapping("/add")

    public void addProduct(@RequestBody Product product){
        service.addProduct(product);

    }
    @GetMapping("/get-all")
    public List<Product>getAll(){
        return service.getAll();

    }
}
