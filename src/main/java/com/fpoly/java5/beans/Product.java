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
public class Product {
    private Optional<Integer> id;
    private String productName;
    private int quantity;
    private Double price;
    private String flavor;
    private String descriptions;
    private String ingredients;
    private Category category;
    private Boolean active;
    private List<Image> images;
    private List<OrderDetail> orderDetails;
    private List<Comment> comments;
}
