package com.charissdev.springbootsearchrestapi.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private  Long id;
    private String sku;
    private String name;
    private String description;
    private boolean active;
    private String imageUrl;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;
}
