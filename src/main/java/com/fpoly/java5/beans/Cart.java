package com.fpoly.java5.beans;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cart {
    private int id;
    private User user;  
    private List<CartItem> cartItems;
}
