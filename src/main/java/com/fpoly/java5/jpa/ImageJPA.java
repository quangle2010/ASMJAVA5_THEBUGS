package com.fpoly.java5.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.java5.entities.Image;

public interface ImageJPA extends JpaRepository<Image,Integer>{

}
