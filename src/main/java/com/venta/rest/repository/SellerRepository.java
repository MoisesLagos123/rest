package com.venta.rest.repository;

import com.venta.rest.model.SellerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<SellerModel, Integer> {
    Optional<SellerModel>  findByUsername(String username);
}
