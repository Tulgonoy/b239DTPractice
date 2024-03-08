package day02;

import java.util.Scanner;

public class P02_StringMnaipulation {
    public static void main(String[] args) {
        // Write a Java program gets string from user,and to extract the middle characters from
        //given string. Use ternary //ex: john -->oh print -->i   abcdef

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String inputString = scan.nextLine();

        int lengthOfString = inputString.length(); //length of given string
        int middle = lengthOfString / 2; //to find middle number

        //if string length is even number then middle chars : inputString.substring(middle-1, middle+1)
        //if sting length is odd number then middle char : inputString.substring(middle, middle+1)

        String midChar =  (lengthOfString%2==0) ? inputString.substring(middle-1, middle+1) : inputString.substring(middle, middle+1);
        System.out.println(midChar);



    }
}
