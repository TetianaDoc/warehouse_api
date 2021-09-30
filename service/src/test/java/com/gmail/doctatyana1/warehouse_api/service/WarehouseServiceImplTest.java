package com.gmail.doctatyana1.warehouse_api.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Add unit tests for {@link WarehouseServiceImpl}
 */


final class WarehouseServiceImplTest {
    private WarehouseService warehouseService = new WarehouseServiceImpl(10);

    @Test
    void shouldCountGoods() {
        //Arrange
        warehouseService = new WarehouseServiceImpl(20);
        // Act and Assert
        assertThat(warehouseService.count()).isEqualTo(20);
    }

    @Test
    void shouldAddNewGood() {
        //Arrange
        long numberOfGoodsBefore = warehouseService.count();
        //Act
        warehouseService.add();
        //Assert
        assertThat(warehouseService.count()).isEqualTo(numberOfGoodsBefore + 1);
    }

    @Test
    void shouldRemoveGood() {
        //Arrange
        long numberOfGoodsBefore = warehouseService.count();
        //Act
        warehouseService.delete();
        //Assert
        assertThat(warehouseService.count()).isEqualTo(numberOfGoodsBefore - 1);
    }

}
