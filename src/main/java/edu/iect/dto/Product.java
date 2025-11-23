package edu.iect.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {
    private String productid;
    private String productName;
    private String description;
    private String catagory;
    private Double unitprice;
    private String qty;
}
