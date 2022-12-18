package com.projects.pizzabil;

public class Printpizzabil {
    public static void main(String[] args) {
       // Pizza basepizaa= new Pizza(false);
      // basepizaa.addExtraCheese();
      // basepizaa.addExtraToppings();
     //  basepizaa.takeAway();
    //    basepizaa.getBill();

        DeluxPizza dp=new DeluxPizza(false);
        dp.takeAway();
        dp.getBill();
    }
}
