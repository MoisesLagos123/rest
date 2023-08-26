package com.venta.rest.repository;

import com.venta.rest.model.SaleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SaleRepository  extends JpaRepository<SaleModel, Integer> {
    Optional<SaleModel>  findById(Integer id_sale);
}
