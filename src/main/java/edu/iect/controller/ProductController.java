package edu.iect.controller;

import edu.iect.dto.Product;
import edu.iect.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/product")
@CrossOrigin
public class ProductController {

    private final ProductService service;

    @PostMapping
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
    @GetMapping("/get-all")
    public List<Product>getAll(){
        return service.getAll();
        }
    @PostMapping("/update")
    public void updateProduct(@RequestBody Product product){
       service.updateProduct(product);

    }
}
