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
public class Order {
    private int id;
    private String fullName;
    private String phone;
    private String address;
    private Date date;
    private String status;
    private User user;
    private List<OrderDetail> orderDetails;
}
