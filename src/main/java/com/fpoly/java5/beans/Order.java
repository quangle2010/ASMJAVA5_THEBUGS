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
public class Order {
    private Optional<Integer> id;
    private String fullName;
    private String phone;
    private String address;
    private Date date;
    private String status;
    private User user;
    private Boolean active;
    private List<OrderDetail> orderDetails;
}
