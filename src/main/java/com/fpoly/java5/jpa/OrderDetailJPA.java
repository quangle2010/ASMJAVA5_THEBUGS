package com.fpoly.java5.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.java5.entities.OrderDetail;

public interface OrderDetailJPA extends JpaRepository<OrderDetail,Integer> {

}
