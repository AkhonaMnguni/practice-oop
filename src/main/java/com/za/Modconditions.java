package com.za;
import java.util.Scanner;

public class Modconditions {
    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // IF STATMENT =  PERFORMS A BLOCK OF CODE IF ITS A CONDITION IS TRUE OR FALSE
        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name:😁 ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student?:");
        isStudent = scanner.nextBoolean();

        //GROUP1

        if(name.isEmpty()){
            System.out.println("you didn't enter yor name 🤦‍♀️");
        }
        else{
            System.out.println("Hello " + name + "!🫂 ");
        }


        //GROUP2

        if (age >= 70){
            System.out.println("you are a senior cityzen👵!");
        }
        else if (age >= 18){
            System.out.println("you are an adult!👩");
        }
        else if(age < 0){
            System.out.println("you haven't been born yet!🤰");
        }
        else if(age == 0){
            System.out.println("you are a baby 👶!");
        }

        else{
            System.out.println("you are a child 👦!");
        }

        //GROUP3

        if(isStudent){
            System.out.println("You are a student 👩‍🎓!");
        }
        else{
            System.out.println("You are not a student!😒");
        }





        scanner.close();
    }









}
