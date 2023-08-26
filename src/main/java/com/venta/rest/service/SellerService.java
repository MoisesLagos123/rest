package com.venta.rest.service;

import com.venta.rest.model.SellerModel;
import com.venta.rest.repository.SellerRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerService {

    private final SellerRepository sellerRepository;

    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public List<SellerModel> listAllSeller(){
        return sellerRepository.findAll();
    }

    public boolean saveSeller(SellerModel seller) {
        try {
            String username = seller.getUsername();
            if (sellerRepository.findByUsername(username).isPresent()){
                return false;
            }else {
                sellerRepository.save(seller);
                return true;
            }

        } catch (Exception e){
            return false;
        }


    }

    public void deleteSeller(SellerModel seller) {
        sellerRepository.delete(seller);
    }

    public Optional<SellerModel> getSeller(Integer id) {
        return sellerRepository.findById(id);
    }

    public void updateSeller(SellerModel seller) {
        sellerRepository.save(seller);
    }




}
