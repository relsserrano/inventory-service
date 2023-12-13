package com.springex.inventoryservice.service;

import com.springex.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    @Autowired
    private final InventoryRepository repository;

    @Transactional(readOnly = true)
    public boolean checkProductStock(String skuCode) {
        return repository.findBySkuCode(skuCode).isPresent();
    }
}
