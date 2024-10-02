package com.fpoly.java5.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.java5.entities.Cart;

public interface CartJPA extends JpaRepository<Cart,Integer> {

}
