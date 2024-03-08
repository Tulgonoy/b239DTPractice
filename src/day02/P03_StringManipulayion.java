package day02;

import java.util.Scanner;

public class P03_StringManipulayion {
    public static void main(String[] args) {
        //write a java program that checks a given string is palindrome

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        //cleaning white spaces and convert to lower case
        String cleanedInput = input.replace(" ", "").toLowerCase();

        //reverse the string
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        //check if reversedInput and cleanedInput are the same
        boolean isPalindrome = cleanedInput.equals(reversedInput);

        System.out.println("is Palindrome: "+ isPalindrome);



    }}
