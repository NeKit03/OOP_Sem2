package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine{
    private List<Product> productList=new ArrayList<>();

    public  void addBottleOfWoter(BottleOfWater bottle){
        productList.add(bottle);
    }
    public VendingMachineBottleOfWater() {
        this.productList=new ArrayList<>();
    }


    @Override
    public String toString() {
        return "VendingMachineBottleOfWater{" +
                "productList=" + productList +
                '}';
    }

    @Override
    public Product getProduct(String name) {
        for(Product i : productList){
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
