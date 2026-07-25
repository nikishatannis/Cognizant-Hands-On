package com.cognizant.inventory_service.service;

import com.cognizant.inventory_service.model.Inventory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class InventoryService {

    public List<Inventory> getInventory() {

        return Arrays.asList(

                new Inventory(1,50),
                new Inventory(2,30),
                new Inventory(3,80)

        );

    }

    public Inventory getInventoryByProductId(int id){

        return getInventory()

                .stream()

                .filter(i -> i.getProductId()==id)

                .findFirst()

                .orElse(null);

    }

}