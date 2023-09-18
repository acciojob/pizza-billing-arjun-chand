package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int extraCheesePrice = 80;
    boolean extraCheeseAdded = false;
    int basePrice;
    int extraToppingsPrice;
    boolean extraToppingsAdded = false;
    int takeAwayPrice = 20;
    public int totalPrice;
    boolean takeAwayAdded = false;
    boolean isBillGenerated = false;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.isVeg = isVeg;
        if (isVeg)
            basePrice = 300;
        else
            basePrice = 400;
        price = basePrice;
    }


    public int getPrice(){

        return price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!extraCheeseAdded){
            price += extraCheesePrice;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isVeg){
            extraToppingsPrice = 70;
        }
        else{
            extraToppingsPrice = 120;
        }
        if (!extraToppingsAdded) {
            price += extraToppingsPrice;
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!takeAwayAdded){
            price += takeAwayPrice;
        }
        takeAwayAdded = true;
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated) {
            bill = "Base Price Of The Pizza: " + basePrice + "\n";

            if (extraCheeseAdded) {
                bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
            }
            if (extraToppingsAdded) {
                bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
            }
            if (takeAwayAdded) {
                bill += "Paperbag Added: " + takeAwayPrice + "\n";
            }
            bill += "Total Price:" + price;
        }
        isBillGenerated = true;
        return this.bill;

    }
}
