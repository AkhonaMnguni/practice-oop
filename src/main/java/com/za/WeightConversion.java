package com.za;
import java.util.Scanner;
public class WeightConversion {
  public static void main(String[] args){

      //WEIGHT CONVERSION PROGRAM

      Scanner scanner = new Scanner(System.in);

      // DECLARE  VARIABLES
      double weight;
      double newWeight;
      int choice;

      // WELCOME MESSAGE
      System.out.println("Weight Conversion Program");
      System.out.println("1: Convert lbs to kgs");
      System.out.println("2: Convert kgs to lbs");

      // PROMPT FOR USER CHOICE
      System.out.print("Choose an option: ");
      choice = scanner.nextInt();

//      System.out.println(choice);

      // OPTION 1 CONVERT LBS TO KGS
      if(choice == 1){
          System.out.println("Enter the weight in lbs: ");
          weight = scanner.nextDouble();
          newWeight = weight * 0.453592;
//          System.out.print("The new weight in kgs is: " + newWeight);
          System.out.printf("The new weight in kgs is: %.2f" , newWeight);
      }

      // OPTION 2 CONVERT  KGS TO LBS
      else if(choice == 2){
          System.out.println("Enter the weight in kgs: ");
          weight = scanner.nextDouble();
          newWeight = weight * 2.20462;
//          System.out.print("The new weight in lbs is: " + newWeight);
          System.out.printf("The new weight in lbs is: %.2f" , newWeight);
      }

      // else print not a valid choice
      else{
          System.out.println("That was not a valid choice");
      }


      scanner.close();
  }

}
