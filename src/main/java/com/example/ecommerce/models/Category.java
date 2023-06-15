package com.example.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public enum Category {

    MEN, WOMEN, CHILDREN;

    @Id
    private Long categoryID;
}
