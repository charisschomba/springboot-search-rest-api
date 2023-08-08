package com.charissdev.springbootsearchrestapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String sku;
    private String name;
    private String description;
    @JsonIgnore
    private boolean active;
    private String imageUrl;
    @CreationTimestamp
    private LocalDate dateCreated;
    @UpdateTimestamp
    private LocalDate dateUpdated;
}