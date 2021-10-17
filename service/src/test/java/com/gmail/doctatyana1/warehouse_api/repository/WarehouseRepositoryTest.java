package com.gmail.doctatyana1.warehouse_api.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * Tests for {@link WarehouseRepository}
 */

class WarehouseRepositoryTest {

    private WarehouseRepository warehouseRepository=new WarehouseRepository(10);

    @Test
    void shouldCountGoods(){
        //Arrange
        warehouseRepository=new WarehouseRepository(20);

        //Assert and act
        assertThat(warehouseRepository.count()).isEqualTo(20);
    }

    @Test
    void shouldAddNewGoods(){
        //Arrange
        long numberOfGoodsBefore=warehouseRepository.count();

        //Act
        warehouseRepository.add();

        //Assert
        assertThat(warehouseRepository.count()).isEqualTo(numberOfGoodsBefore+1);
    }

    @Test
    void shoudRemoveGoods(){
        //Arrange
        long numberOfGoodsBefore=warehouseRepository.count();

        //Act
        warehouseRepository.delete();

        //Assert
        assertThat(warehouseRepository.count()).isEqualTo(numberOfGoodsBefore-1);
    }


}