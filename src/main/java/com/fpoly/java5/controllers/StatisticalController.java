package com.fpoly.java5.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fpoly.java5.entities.CategoryProductCount;
import com.fpoly.java5.entities.Product;
import com.fpoly.java5.jpa.ProductJPA;

@Controller
public class StatisticalController {
	@Autowired
	ProductJPA g_productJPA;
    @GetMapping("/admin/statistical-order")
    public String statisticalOrderPage(Model model) {
        model.addAttribute("namePage", "Thống kê hóa đơn");
        model.addAttribute("view", "admin/statistical-order");
        return "index";
    }
    
    @GetMapping("/admin/statistical-product")
    @Transactional(readOnly = true)
    public String statisticalProductPage(Model model) {
        model.addAttribute("namePage", "Thống kê sản phẩm");
        model.addAttribute("view", "admin/statistical-product");
        
        List<Product> products = g_productJPA.findAllWithActive(true);
        List<Object[]> procedureCall = g_productJPA.getCategoryProductSummary();

        List<CategoryProductCount> categoriesCount = new ArrayList<>();
        for (Object[] obj : procedureCall) {
            String categoryName = (String) obj[0];  
            Long totalProducts = ((Number) obj[1]).longValue(); 
            categoriesCount.add(new CategoryProductCount(categoryName, totalProducts));
        }
        
        List<String> productsName = new ArrayList<>();;
        List<Integer> productsQuantity = new ArrayList<>();;
        
        for(Product product : products) {
        	productsName.add(product.getProductName());
        	productsQuantity.add(product.getQuantity());
        }
        
        model.addAttribute("categories",categoriesCount);
        model.addAttribute("productCount", products.size());
        model.addAttribute("productsName", productsName);
        model.addAttribute("productsQuantity", productsQuantity);
        return "index";
    }

}
