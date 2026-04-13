package com.za;
import java.util.Scanner;

public class Grocery {
    public  static  void main(String[] args){
        //SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

       String item ;
       double price;
       int quantity;
       char currency = '$';
       double total ;

        System.out.println("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.println("what is the item for each?: ");
       price = scanner.nextDouble();

        System.out.println("How many would you like to buy? ");
        quantity = scanner.nextInt();

        System.out.println(quantity);

        total = price * quantity;

//       System.out.println(total);
        System.out.println("/nYou have bought " + quantity + " " + item +"/s ");
        System.out.println("Your total is " + currency + total);




        scanner.close();
    }
}
