package com.za;
import java.util.Scanner;
public class SubStrings {
    public static void main(String[] args){

        // .substring() =  A method used to extract a portion of a string
        //                string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain ;


        System.out.print("Enter your email: ");
        email = scanner.nextLine();

//        username = email.substring(0, email.indexOf("@"));
//        domain = email.substring(email.indexOf("@") + 1);
//        System.out.println("Your  student email is: " + email);

//        System.out.println(username);
//        System.out.println(domain);
        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Your  student email is: " + email);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");

        }
//




/// //////////////////////////////////////////////////////////////////

//        String email = "akhonamnguni023@gmail.com";

//        String username = email.substring(0, 15);
////        String domain = email.substring(16, 25);
//        String domain = email.substring(16);

//        String username = email.substring(0, email.indexOf("@"));
//        String domain = email.substring(email.indexOf("@"));


//        System.out.println(username);
//        System.out.println(domain);

        scanner.close();
    }
}
