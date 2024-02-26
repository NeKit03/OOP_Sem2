package org.example;

abstract public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public void setName(String name) {

        this.name = name;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }




}