package com.jsprogramming.inventoryservice.controller;

import com.jsprogramming.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    // Multiple sku codes
    // http://localhost:8082/api/inventory?sku-code=iphone-13&sku-code=iphone13-red
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
