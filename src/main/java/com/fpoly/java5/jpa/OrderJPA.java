package com.fpoly.java5.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.java5.entities.Order;

public interface OrderJPA extends JpaRepository<Order,Integer> {

}
