package com.fpoly.java5.beans;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartItem {
   
     private Optional<Integer> id;
    private Cart cart;
    private ProductBean product;
    private int quantity;
}
