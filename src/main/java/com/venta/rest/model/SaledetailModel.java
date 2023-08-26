package com.venta.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "saledetail")
public class SaledetailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_saleDetail;

    @ManyToOne
    @JoinColumn(name = "id_menu")
    private MenuModel menuModel;


    @ManyToOne
    @JoinColumn(name = "id_sale")
    private SaleModel saleModel;


}
