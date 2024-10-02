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

public class User {
    private Optional<Integer> id;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private String username;
    private String passwords;
    private Boolean roles;
    private Date createdAt;
    private Boolean active;
    private List<Order> orders;
    private List<Comment> comments;
    private Cart cart;
}
