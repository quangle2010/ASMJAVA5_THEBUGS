package com.fpoly.java5.beans;
import java.util.*;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductBean {
    private Optional<Integer> id;
    private String productName;
    private int quantity;
    private Double price;
    private String flavor;
    private String descriptions;
    private String ingredients;
    private int category;
    private Boolean active;
    private ArrayList<MultipartFile> images;
    private List<OrderDetail> orderDetails;
    private List<Comment> comments;
}
