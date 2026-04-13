package com.za;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        // Arithmetic  Maths Operators

        int x = 10;
        int y = 2;
        int z;

         z = x + y;
//         z = x - y;
//         z = x * y;
         z = x / y;
//         z = x % y;
        System.out.println(z);

        // Augemented Assignment Operators

//        x += y;
//        x -= y;
       x *= y;
//        x /= y;
//        x %= y;
       System.out.println(x);

//        // Increment and Decrement Operators
//        int x = 1;
       x = x + 1;
            x++;
//            x++;
//            x--;
        System.out.println(x);

        // Order of Operations [P-E-M-D-A-s]

//        double result = 3 + 4 * (7 - 5) / 2.0;
        // now using P-E-M-D-A-S
        double result = 7;
        System.out.println(result);

//        scanner.close();
    }
}
