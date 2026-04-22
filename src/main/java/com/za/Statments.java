package com.za;

          //NESTED IF() STATMENTS

public class Statments {
    public static void main(String[] args){

        boolean isStudent = true;
//        boolean isStudent = false;
//        boolean isSenior;
        boolean isSenior = true;
//        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a student discount of 20%");
                System.out.println("You get a student discount of 10%");

                price = price * 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price = price * 0.9;

            }
//            System.out.println("You get a student discount of 10%");
//            price = price * 0.9;
        }
        else{
//          price *= 1;
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
        }
//        System.out.println("The price of a ticket is: $" + price);
        System.out.printf("The price of a ticket is: $%.2f" , price);
    }
}
