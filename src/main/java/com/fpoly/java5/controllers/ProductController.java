package com.fpoly.java5.controllers;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fpoly.java5.jpa.CategoryJPA;
import com.fpoly.java5.jpa.ImageJPA;
import com.fpoly.java5.jpa.ProductJPA;
import com.fpoly.java5.beans.ProductBean;
import com.fpoly.java5.entities.Category;
import com.fpoly.java5.entities.Image;
import com.fpoly.java5.entities.Product;

@Controller
public class ProductController {
	@Autowired
	ProductJPA g_productJPA;
	
	@Autowired
	CategoryJPA g_categoryJPA;

	@Autowired
	ImageJPA g_imageJPA;
	@GetMapping("/product")
	public String productPage(Model model) {
		model.addAttribute("namePage", "Sản phẩm");
		model.addAttribute("view", "user/product");
		return "index";
	}

	@GetMapping("/productdetail")
	public String productdetailPage(Model model) {
		model.addAttribute("namePage", "Chi tiết sản phẩm");
		model.addAttribute("view", "user/productdetail");
		return "index";
	}

	@GetMapping("/admin/list-product")
	public String listProductPage(Model model, @RequestParam("searchKey") Optional<String> searchKey,
												@RequestParam("category") Optional<Integer> categoryKey) {
		model.addAttribute("namePage", "Danh sách sản phẩm");
		model.addAttribute("view", "admin/list-product");
		
		String search = searchKey.orElse("");
	    int categoryId = categoryKey.orElse(0);
	    List<Product> products = null;
	    if (searchKey.isPresent()) {
	    	if (categoryKey.isPresent()) {
	    		products = g_productJPA.findProductsBySearchAndCategoryId(search, categoryId, true);				
			} else {
				products = g_productJPA.findProductsBySearchKey(search, true);
			}
		} else if(categoryKey.isPresent()) {
			products = g_productJPA.findProductsByCategoryId(categoryId, true);
		} else {
			products = g_productJPA.findAllWithActive(true);
		}
	    
		List<Category> categories = g_categoryJPA.findAllWithActive(true);
		
		model.addAttribute("products", products);
		model.addAttribute("categories", categories);
		return "index";
	}

	@GetMapping("/admin/form-product")
	public String fromProductPage(Model model, @RequestParam("id") Optional<Integer> ID) {
		model.addAttribute("namePage", "Form sản phẩm");
		model.addAttribute("view", "admin/form-product");
		
		List<Category> categories = g_categoryJPA.findAllWithActive(true);
	    model.addAttribute("categories", categories);
	    
		if (ID.isPresent()) {
			Optional<Product> product = g_productJPA.findById(ID.get());
			if (product.isPresent()) {
				model.addAttribute("product", product.get());
			}
		} else {
			model.addAttribute("product", new Product());
		}
		
		return "index";
	}
	@GetMapping("/admin/delete-product")
	public String deleteProduct(@RequestParam("id") Optional<Integer> ID) {
		if (!ID.isPresent()) {
			return "redirect:/admin/list-product";
		}
		if (g_imageJPA.findById(ID.get()).isPresent()) {
			g_imageJPA.softRemoveImageByProductId(ID.get(), false);
			g_productJPA.softRemoveProductByProductId(ID.get(), false);
		}
		
		return "redirect:/admin/list-product";
	}
	@PostMapping("/admin/save-product")
	public String saveProduct(ProductBean beans) {
		Optional<Category> catEntity = g_categoryJPA.findById(beans.getCategory());
		
		Product productEntity = new Product();
		
		if (beans.getId() != null && beans.getId().isPresent()) {
		    productEntity.setId(beans.getId().get());
		    if (!beans.getImages().isEmpty()) {
		    	int removeCount = g_imageJPA.softRemoveImageByProductId(productEntity.getId(), false);
		    	System.out.println("Tổng ảnh đã xóa [CSDL]: " + removeCount);
			}
		}
		
		productEntity.setProductName(beans.getProductName());
		productEntity.setQuantity(beans.getQuantity());
		productEntity.setPrice(beans.getPrice());
		productEntity.setDescriptions(beans.getDescriptions());
		productEntity.setIngredients(beans.getIngredients());
		productEntity.setFlavor(beans.getFlavor());
		productEntity.setActive(true);
		
		if (catEntity.isPresent()) {
			productEntity.setCategory(catEntity.get());
		}
		
		g_productJPA.save(productEntity);
		
		saveImage(beans.getImages(), productEntity);
		return "redirect:/admin/list-product";
	}
	
	private boolean saveImage(ArrayList<MultipartFile> images, Product product) {
		for(int i = 0; i < images.size(); i ++) {
			Path filePath = Paths.get("images");
			try {
				if (images.get(i).isEmpty()) {
					return false;
				}
	            Files.createDirectories(filePath);
	            Date date=new Date();
	            
	            String fileName = date.getTime()+".jpg";
	            Files.copy(images.get(i).getInputStream(), filePath.resolve(fileName));
	            Image image = new Image();
	            image.setImageName(fileName);
	            image.setProduct(product);
	            image.setActive(true);
	            
	            g_imageJPA.save(image);
	            
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

}
