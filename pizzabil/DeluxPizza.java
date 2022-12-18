package com.projects.pizzabil;

public class DeluxPizza extends Pizza{

    public DeluxPizza(Boolean veg) {
        super(veg);
        //Here the method of Pizza class addExtraCheese is added using super .
        super.addExtraCheese();
        //Here the method of Pizza class addExtraToppings is added using super .
        super.addExtraToppings();
    }
    //WE have use method overriding because we do not wnat to give the user to add any other extratopping
    //or cheese to the delux pizza as it is default added.
        @Override
        public void addExtraCheese(){}
        @Override
        public void addExtraToppings(){}
}
