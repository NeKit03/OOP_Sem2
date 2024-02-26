package org.example;

import java.util.ArrayList;
import java.util.List;

public  class HotDrinkMachine implements VendingMachine {
    private  List<Product> hotList=new ArrayList<>();
    public HotDrinkMachine() {
        this.hotList=new ArrayList<>();
    }

    public  void addHotDrink(HotDrink hotDrink){
        hotList.add(hotDrink);
    }

    public Product getHotDrinkList(String name) {
        for(Product i : hotList){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "HotDrinkMachine{" +
                "hotList=" + hotList +
                '}';
    }

    @Override
    public Product getProduct(String name) {
        for(Product i : hotList){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    @Override
    public void setProductList(List<Product> productList) {

    }
}
