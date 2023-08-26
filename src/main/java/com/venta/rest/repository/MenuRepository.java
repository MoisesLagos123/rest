package com.venta.rest.repository;


import com.venta.rest.model.MenuModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MenuRepository extends JpaRepository<MenuModel, Integer> {
    Optional<MenuModel> findByName(String name);
}
