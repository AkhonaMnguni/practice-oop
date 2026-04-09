package com.za;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        //    calculate area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

//        System.out.print("Enter the area: ");
//        area = scanner.nextDouble();

        System.out.println("The area is: " + area + "cm²");



        scanner.close();

    }


}
