package com.fpoly.java5.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment {
    private int id;
    private String comment;
    private User user;
    private Product product;
}
