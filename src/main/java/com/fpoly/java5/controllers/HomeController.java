package com.fpoly.java5.controllers;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fpoly.java5.entities.Comment;
import com.fpoly.java5.entities.Product;
import com.fpoly.java5.jpa.CommentJPA;
import com.fpoly.java5.jpa.ProductJPA;

@Controller
public class HomeController {
	@Autowired
	ProductJPA g_productJPA;
	
	@Autowired
	CommentJPA g_commentJPA;
	
	@GetMapping("/home")
	public String homePage(Model model) {
		model.addAttribute("view", "user/home");

		List<Product> products =  g_productJPA.findAllWithActive(true);
		
		
		List<Product> new3Products = products.stream()
			    .sorted(Comparator.comparingInt(Product::getId).reversed())
			    .limit(5)
			    .collect(Collectors.toList());
		
		List<Product> specialProducts = products.stream()
			    .sorted(Comparator.comparingInt(Product::getId))
			    .limit(4)
			    .collect(Collectors.toList());
		
		List<Comment> userComments = g_commentJPA.findAll();
		userComments = userComments.stream()
				.sorted(Comparator.comparing(Comment::getId))
				.limit(2)
				.collect(Collectors.toList());
		
		model.addAttribute("userComments", userComments);
		model.addAttribute("newProducts", new3Products);
		
		model.addAttribute("specialProducts", specialProducts);
		return "index";
	}
	
}
