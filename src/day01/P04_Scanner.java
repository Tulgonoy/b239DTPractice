package day01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P04_Scanner {
    public static void main(String[] args) {
        //Ask user to enter name and age, print result
        // like : Hello, userName, you re age years old
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Hello, "+ name +". You are "+ age+ " years old.");

    }
}
