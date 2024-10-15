package com.fpoly.java5.beans;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetail {
    private Optional<Integer> id;
    private Order order;
    private ProductBean product;
    private int quantity;
    private Double price;
    private Boolean active;
}
