package day03;

import java.util.Scanner;

public class P04_ForLoops {
    public static void main(String[] args) {
        //write a java program to check whether a given number is prime or not
        // 6 = 1, 2, 3, 6 => not prime
        // 7 = 1, 7 =>prime

        int num = 53;

        boolean isPrime = true;
        for (int i = 2; i <  num/2; i++){
            if(num%i == 0){
                isPrime = false; //change the value of isPrime
                break; //stop the loop
            }
        }

        if(isPrime){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not prime number");
        }

    }
    }

