package day03;

import java.util.Scanner;

public class P06_whileLoop {
    public static void main(String[] args) {
        //write a java code which will ask user to enter any natural number
        //and add those entered numbers
        //when the sum of entered numbers is over 500, stop asking another number
        //and print sum and no need for number

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(sum<=500){
            //these codes will be executed when sum is less than 500
            System.out.println("Enter any natural number less than 500");
            int userInput = scanner.nextInt();
            sum+=userInput; // sum = sum+userInput;

        }
        System.out.println("You do not need to enter new number, sum is "+sum);


    }
}
