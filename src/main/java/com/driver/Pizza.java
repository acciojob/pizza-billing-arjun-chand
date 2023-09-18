package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int extraCheesePrice;
    boolean extraCheeseAdded = false;
    int extraToppingsPrice;
    boolean extraToppingsAdded = false;
    int takeAwayPrice;
    public int totalPrice;
    boolean takeAwayAdded = false;
    boolean isBillGenerated = false;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.isVeg = isVeg;
        if (isVeg) {
            this.price = 300;
            this.extraToppingsPrice = 70;
        }
        else {
            this.price = 400;
            this.extraToppingsPrice = 120;
        }
        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
        ;
    }


    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!this.extraCheeseAdded){
            this.price += this.extraCheesePrice;
            this.extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!this.extraToppingsAdded) {
            this.price += this.extraToppingsPrice;
            this.extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!this.takeAwayAdded){
            this.price += this.takeAwayPrice;
        }
        this.takeAwayAdded = true;
    }

    public String getBill(){
        // your code goes here
        if(!this.isBillGenerated) {


            if (extraCheeseAdded) {
                bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if (extraToppingsAdded) {
                bill += "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }
            if (takeAwayAdded) {
                bill += "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            bill += "Total Price:" + this.price;
            this.isBillGenerated = true;
        }

        return this.bill;

    }
}
