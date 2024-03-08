package day02;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your city name ");
        String name = scan.nextLine();
        String result = name.replaceAll("[a,o,u,i,e,u,A,I,O,U,E]","");
        System.out.println(result);
    }
}
