package com.gmail.doctatyana1.warehouse_api.repository;

/**
 * Warehouse Repository
 */
public final class WarehouseRepository {
    private long numberOfGoods;

    public WarehouseRepository(long numberOfGoods){
        this.numberOfGoods=numberOfGoods;
    }

    public void add(){
        numberOfGoods++;
    }

    public void delete(){
        numberOfGoods--;
    }

    public long count(){
        return numberOfGoods;
    }


}
