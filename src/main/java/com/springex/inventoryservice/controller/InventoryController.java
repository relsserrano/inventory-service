package com.springex.inventoryservice.controller;

import com.springex.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    @Autowired
    private final InventoryService inventoryService;

//    @GetMapping("/{sku}")
//    @ResponseStatus(HttpStatus.OK)
//    public boolean checkStock(@PathVariable("sku") String skuCode) {
//        return inventoryService.checkProductStock(skuCode);
//    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public boolean checkStockMultiple(@RequestParam("skuCode") List<String> skuCode) {
        return inventoryService.checkProductStocks(skuCode);
    }
}
