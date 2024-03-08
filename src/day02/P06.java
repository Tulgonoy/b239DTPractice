package day02;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        //write a Java program that capitalizes the last two letters of a given string
        Scanner scan = new Scanner(System.in);
        System.out.println("String : ");
        String input = scan.nextLine();
        if (input.length()>=2){
            input = input.substring(0,input.length()-2)+ input.substring(input.length()-2).toUpperCase();
            System.out.println(input);
        }else {
            System.out.println("sorrry");

    }
}}
