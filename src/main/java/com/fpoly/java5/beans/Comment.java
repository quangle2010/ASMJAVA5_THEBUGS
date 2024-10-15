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
public class Comment {

      private Optional<Integer> id;
    private String comment;
    private User user;
    private ProductBean product;
    private Boolean active;
}
