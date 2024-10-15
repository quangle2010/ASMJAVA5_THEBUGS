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
public class Category {

    private Optional<Integer> id;
    public String categoryName;
    public String categoryImage;
    public Boolean active;
    public List<ProductBean> products;
}
