package day03;

import java.util.Scanner;

public class P07_WhileLoop {
    public static void main(String[] args) {
        //write a java code which will ask user number
        //sums those numbers if the entered number is not 0;
        // if user enters 0, code will stop and return the sum

        Scanner scanner = new Scanner(System.in);


        int sum= 0;
        int number = -1;

        //to while

//        do{
//            //whatever here will be executed at least once
//            System.out.println("Enter a number: ");
//            number = scanner.nextInt(); //
//            sum = sum+number;
//
//        }while(number!=0);
//
//

        //while loop 1st way
/*
        while(number!=0){
            System.out.println("Enter a number: ");
            number = scanner.nextInt(); //
            sum = sum+number;
        }
        System.out.println("Sum of your entered numbers : "+sum);
*/
        while(true){
            System.out.println("Enter a number: ");
            number = scanner.nextInt(); //

            if(number!=0){
                sum = sum+number;
            }else{
                break;
            }

        }
        System.out.println("Sum of your entered numbers : "+sum);
    }
}
