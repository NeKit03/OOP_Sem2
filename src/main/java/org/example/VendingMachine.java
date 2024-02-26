package org.example;

import java.util.List;

public interface VendingMachine {

    Product getProduct(String name);
    public void setProductList(List<Product> productList);



}
