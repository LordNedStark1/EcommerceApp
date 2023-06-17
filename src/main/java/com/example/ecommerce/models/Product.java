package com.example.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int quantity;
    private String name;

//    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @Enumerated
    private Category category;
}
