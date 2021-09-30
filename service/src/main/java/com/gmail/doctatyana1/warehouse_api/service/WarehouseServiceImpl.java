package com.gmail.doctatyana1.warehouse_api.service;

/**
 * Add implementation for interface {@link WarehouseService}
 */

public final class WarehouseServiceImpl implements WarehouseService{

    private final long numberOfGoods;

    public WarehouseServiceImpl(long numberOfGoods) {
        this.numberOfGoods=numberOfGoods;
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public long count() {
        return numberOfGoods;
    }
}
