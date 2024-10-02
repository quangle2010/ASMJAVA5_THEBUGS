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

public class Category {
    private int id;
    private String name;
    private String image;
    private List<Product> products;
}
