package com.fpoly.java5.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class OrderDetail {
    private int id;
    private int quantity;
    private double price;
    private Order order;
    private Product product;
}
