package com.venta.rest.controller;

import com.venta.rest.model.SellerModel;
import com.venta.rest.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seller")
public class SellerController {

    private final SellerService sellerService;
    @Autowired
    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @PostMapping("/")
    public ResponseEntity<String> saveSeller(@RequestBody SellerModel seller){
        boolean IsSaved = sellerService.saveSeller(seller);
        if (IsSaved) {
            return ResponseEntity.ok("Seller Saved");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Seller not Saved");
        }
    }



}
