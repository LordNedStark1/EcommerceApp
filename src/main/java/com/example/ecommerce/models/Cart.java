package com.example.ecommerce.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long cartId;
   private List<CartProduct> product = new ArrayList<>();
}
