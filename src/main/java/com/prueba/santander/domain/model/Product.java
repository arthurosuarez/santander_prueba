package com.prueba.santander.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Column(name = "productid")
    private Integer productid;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "type", length = Integer.MAX_VALUE)
    private String type;


}