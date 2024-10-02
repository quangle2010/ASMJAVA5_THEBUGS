package com.fpoly.java5.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "passwords", nullable = false)
    private String passwords;

    @Column(name = "roles", nullable = false)
    private boolean roles;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    @OneToOne(mappedBy = "user")
    private List<Cart> carts;
}
