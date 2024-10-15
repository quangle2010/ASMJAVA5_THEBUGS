package com.fpoly.java5.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fpoly.java5.entities.Category;

public interface CategoryJPA extends JpaRepository<Category,Integer>{
	@Query("SELECT c FROM Category c WHERE c.active = ?1")
	List<Category> findAllWithActive(boolean active);
} 
