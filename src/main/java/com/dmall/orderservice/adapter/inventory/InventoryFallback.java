package com.dmall.orderservice.adapter.inventory;

import org.springframework.stereotype.Component;

@Component
public class InventoryFallback implements InventoryClient {
    @Override
    public String lock(Lock lock) {
        return "ID from fallback";
    }

    @Override
    public void unlock(String lockId) {

    }
}
