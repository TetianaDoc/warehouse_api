package com.gmail.doctatyana1.warehouse_api.service;

import com.gmail.doctatyana1.warehouse_api.domain.Goods;
import com.gmail.doctatyana1.warehouse_api.repository.WarehouseRepository;

/**
 * 1. Add implementation for interface {@link WarehouseService}
 *
 * 2. Should be stateless!
 */

public final class WarehouseServiceImpl implements WarehouseService {

    private final WarehouseRepository warehouseRepository;

    public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public void add(Goods goods) {
        warehouseRepository.add();
    }

    @Override
    public void delete() {
        warehouseRepository.delete();
    }

    @Override
    public long count() {
        return warehouseRepository.count();
    }
}
