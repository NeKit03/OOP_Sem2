package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      VendingMachineBottleOfWater machine=new VendingMachineBottleOfWater();
      HotDrinkMachine hotMachine = new HotDrinkMachine();
        machine.addBottleOfWoter(new BottleOfWater("Water1",23,34));
        machine.addBottleOfWoter(new BottleOfWater("Вода2",123,314));
        machine.addBottleOfWoter(new BottleOfWater("Вода3",342,3.1));
        machine.addBottleOfWoter(new BottleOfWater("Вода4",3242,324));
        hotMachine.addHotDrink(new HotDrink("copuchino",200,250,65));
        hotMachine.addHotDrink(new HotDrink("latte",150,350,65));
        System.out.println(machine.getProduct("Water1"));
        System.out.println(hotMachine.getProduct("latte"));
        printGetProduct(machine);
        printGetProduct(hotMachine);


    }


    public static void printGetProduct(VendingMachine vendingMachine){
        System.out.println(vendingMachine.getProduct("Water1"));
    }
    public static void printGetProduct(HotDrinkMachine hotDrinkMachine){
        System.out.println(hotDrinkMachine.getProduct("latte"));
    }
}