package com.venta.rest.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sale")
public class SaleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sale;
    @Column(nullable = false)
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "id_seller")
    private SellerModel sellerModel;


}
