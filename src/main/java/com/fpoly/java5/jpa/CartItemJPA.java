package com.fpoly.java5.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.java5.entities.CartItem;

public interface CartItemJPA extends JpaRepository<CartItem,Integer>{

}
