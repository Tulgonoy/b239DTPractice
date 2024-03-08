package day02;

import java.util.Scanner;

public class P04_StringManipulation {
    public static void main(String[] args) {
        // write a java code snippet that checks if a given email address ends with "@gmail.com"
        // and has an identifier part (before "@") with a length greater than 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scanner.next();

        if(email.endsWith("@gmail.com") && email.indexOf('@')>3){
            System.out.println("it is valid email");
        }else{
            System.out.println("it is not valid email");
        }


    }
}
