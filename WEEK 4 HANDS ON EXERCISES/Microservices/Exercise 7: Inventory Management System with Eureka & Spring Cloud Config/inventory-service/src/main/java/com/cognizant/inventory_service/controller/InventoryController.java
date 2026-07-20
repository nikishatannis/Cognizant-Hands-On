package com.cognizant.inventory_service.controller;

import com.cognizant.inventory_service.model.Inventory;
import com.cognizant.inventory_service.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping
    public List<Inventory> getAllInventory() {
        return inventoryService.getInventory();
    }

    @GetMapping("/{id}")
    public Inventory getInventory(@PathVariable int id) {
        return inventoryService.getInventoryByProductId(id);
    }
}