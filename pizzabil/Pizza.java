package com.projects.pizzabil;

public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsPrice=100;
    private int addtobackpack=20;
    private int basePizzaPrice;

    //This varibale is for checking if extra cheese is added.
    private boolean extraCheeseAdded=false;
    //This varibale is for checking if extra toppings is added.
    private boolean extraToppingsAdded=false;
    //This varibale is for checking if take away is added.
    private boolean addedtoTakeAway=false;
    public Pizza(Boolean veg) {

        this.veg = veg;
        //This is for price of veg pizza.
        if (this.veg) {
            this.price = 300;
        }
        //This is for price of non-veg pizza.
        else {
            this.price = 400;
        }
        basePizzaPrice=this.price;
    }
        //This method is for if you are adding extra cheese to your pizza.
        public void addExtraCheese(){
        extraCheeseAdded=true;
           // System.out.println("Extra Cheese added.");
            this.price +=extraCheesePrice;
        }
        //This method is for if you are adding extra toppings to your pizza.
        public void addExtraToppings(){
        extraToppingsAdded=true;
           // System.out.println("Extra Toppings added.");
            this.price +=extraToppingsPrice;
        }
    //This method is for if you are adding extra price of backpack to takeaway your pizza.
        public void takeAway(){
        addedtoTakeAway=true;
         //   System.out.println("Take away available");
            this.price +=addtobackpack;
        }
        String bill="";
        public void getBill(){
            //TO print the price of pizza.
            System.out.println("Pizza: "+basePizzaPrice);

            if(extraCheeseAdded){
                //Price of pizza after cheese added.
                bill += "ExtraCheeseadded:"+extraCheesePrice+"\n";
            }
            if(extraToppingsAdded){
                //Price of pizza after toppings added.
                bill += "ExtraToppingsAdded:"+extraToppingsPrice+"\n";
            }
            if(addedtoTakeAway){
                //Price of pizza after take away is added.
                bill += "addedToTakeAway:"+addtobackpack+"\n";
            }
            //To print total bill is.
            bill +="Total Bill: "+this.price+"\n";
            System.out.println(bill);

        }


}
