package com.fpoly.java5.beans;
import java.util.List;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cart {
    private Optional<Integer> id;
    private User user;
    private List<CartItem> cartItems;
}
