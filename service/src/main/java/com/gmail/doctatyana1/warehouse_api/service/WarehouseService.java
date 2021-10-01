package com.gmail.doctatyana1.warehouse_api.service;

import com.gmail.doctatyana1.warehouse_api.domain.Goods;

/**
 * Main warehouse service, responsible for CRUD operations in the warehouse.
 */
public interface WarehouseService {

  /**
   * Adds a new goods to the warehouse.
   */
  void add(Goods goods);

  /**
   * Deletes goods from the warehouse.
   */
  void delete();

  /**
   * Counts goods in the warehouse.
   */
  long count();
}
