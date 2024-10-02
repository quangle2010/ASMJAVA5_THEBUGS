package com.fpoly.java5.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartItem {
    private int id;
    private int quantity;
    private Cart cart;
    private Product product;
}
