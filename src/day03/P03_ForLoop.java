package day03;

import java.util.Scanner;

public class P03_ForLoop {
    public static void main(String[] args) {
        //write a java program that checks a given string is palindrome
        //madam, noon --> palindrome
        //hello --> not palindrome

        String str = "madam";
        String reversed = "";
        for(int i = str.length() - 1; i>=0; i--){
            reversed+=str.charAt(i);

        }

        if(str.equals(reversed)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }

    }
}
