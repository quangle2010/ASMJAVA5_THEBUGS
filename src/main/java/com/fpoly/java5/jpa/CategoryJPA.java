package com.fpoly.java5.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.java5.entities.Category;

public interface CategoryJPA extends JpaRepository<Category,Integer>{

    
} 
