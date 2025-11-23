package edu.iect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ProductEntity {
    @Id
    private String productid;
    private String productName;
    private String description;
    private String catagory;
    private Double unitprice;
    private String qty;
}
