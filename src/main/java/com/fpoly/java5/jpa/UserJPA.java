package com.fpoly.java5.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.java5.entities.User;

public interface UserJPA extends JpaRepository<User,Integer> {

}
