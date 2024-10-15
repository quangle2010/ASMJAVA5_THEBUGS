package com.fpoly.java5.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.fpoly.java5.entities.Image;

import jakarta.transaction.Transactional;


public interface ImageJPA extends JpaRepository<Image,Integer>{
	@Modifying
	@Transactional
	@Query("UPDATE Image i SET i.active = ?2 WHERE i.product.id = ?1")
	int softRemoveImageByProductId(int id, boolean active);
	
	@Query("SELECT i FROM Image i WHERE i.active = ?1")
	void findAllWithActive(boolean active);
}
