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
public class Product {

    private int id;
    private String productName;
    private int quantity;
    private double price;
    private String flavor;
    private String descriptions;
    private String ingredients;
    private Category category;
    private List<Image> images;
    private List<OrderDetail> orderDetails;
    private List<Comment> comments;
}
