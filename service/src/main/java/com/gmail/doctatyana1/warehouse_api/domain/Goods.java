package com.gmail.doctatyana1.warehouse_api.domain;

/**
 * Add goods entity.
 */

public final class Goods {
private final String name;
private final double price;
public Goods(String name, double price){
    this.name=name;
    this.price=price;
}
public String getName(){
    return name;
}
public double getPrice(){
    return price;
}
}
