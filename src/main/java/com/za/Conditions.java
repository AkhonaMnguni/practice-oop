package com.za;

public class Conditions {
    public static void main(String[] args){

        // IF STATMENT =  PERFORMS A BLOCK OF CODE IF ITS A CONDITION IS TRUE OR FALSE

        int age = 77;

        if (age >= 70){
            System.out.println("you are a senior cityzen!");
        }
        else if (age >= 18){
            System.out.println("you are an adult!");
        }
        else if(age < 0){
            System.out.println("you haven't been born yet!");
        }
        else if(age == 0){
            System.out.println("you are a baby!");
        }

        else{
            System.out.println("you are a child!");
        }


    }

}
