package com.fpoly.java5.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.transaction.annotation.Transactional;

import com.fpoly.java5.entities.CategoryProductCount;
import com.fpoly.java5.entities.Product;



public interface ProductJPA extends JpaRepository<Product,Integer>{
	
	@Modifying
	@Transactional
	@Query("UPDATE Product p SET p.active = ?2 WHERE p.id = ?1")
	int softRemoveProductByProductId(int id, boolean active);
	
	@Query("SELECT p FROM Product p WHERE p.active = ?1")
	List<Product> findAllWithActive(boolean active);
	
	@Query("SELECT p FROM Product p WHERE p.active = ?2 AND p.productName LIKE %?1%")
	List<Product> findProductsBySearchKey(String productName, boolean active);

	@Query("SELECT p FROM Product p WHERE p.active = ?2 AND p.category.id = ?1")
	List<Product> findProductsByCategoryId(int categoryId, boolean active);

	@Query("SELECT p FROM Product p WHERE p.active = ?3 AND p.productName LIKE %?1% AND p.category.id = ?2")
	List<Product> findProductsBySearchAndCategoryId(String productName, int categoryId, boolean active);

	//statisticalProduct
	@Transactional(readOnly = true)
	@Procedure(procedureName = "GetCategoryProductSummary")
	List<Object[]> getCategoryProductSummary();
}
