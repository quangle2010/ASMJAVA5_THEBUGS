package com.fpoly.java5.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "flavor")
    private String flavor;

    @Column(name = "descriptions")
    private String descriptions;

    @Column(name = "ingredients")
    private String ingredients;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Image> images;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "product")
    private List<Comment> comments;
}
