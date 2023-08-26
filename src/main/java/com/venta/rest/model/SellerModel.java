package com.venta.rest.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "seller" )
public class SellerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_seller;
    @Column(nullable = false, unique = true)
    String username;

}
