package com.gmail.doctatyana1.warehouse_api.service;

/**
 * Main warehouse service, responsible for CRUD operations in the warehouse.
 */
public interface WarehouseService {

  /**
   * Adds a new goods to the warehouse.
   */
  void add();

  /**
   * Deletes goods from the warehouse.
   */
  void delete();

  /**
   * Counts goods in the warehouse.
   */
  long count();
}
