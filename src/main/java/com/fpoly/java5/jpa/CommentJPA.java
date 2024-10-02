package com.fpoly.java5.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.java5.entities.Comment;

public interface CommentJPA extends JpaRepository<Comment,Integer> {

}
