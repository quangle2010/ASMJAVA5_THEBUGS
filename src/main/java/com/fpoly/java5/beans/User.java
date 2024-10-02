package com.fpoly.java5.beans;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private String username;
    private String passwords;
    private boolean roles;
    private Date createdAt;
    private List<Order> orders;
    private List<Comment> comments;
    private List<Cart> carts;
}
