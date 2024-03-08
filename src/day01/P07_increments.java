package day01;

public class P07_increments {
    public static void main(String[] args) {
        int num1 = 2;
        System.out.println("num1: "+ num1);
        num1 = num1 + 3;
        System.out.println("num1: "+ num1);

        num1+=4; //num1= num1+4
        System.out.println("num1: "+ num1);

        num1=num1+1; // num1+=1 // num1++
        System.out.println("num1: "+ num1);

        int num2 = 3;

        int result = num2++; //post increment = assign value value first, then increment
        System.out.println("result: "+ result); //3
        System.out.println("num2: "+num2); //4

        result = ++num2; //pre increment = increase first, them assign value
        System.out.println("result: "+ result);
        System.out.println("num2: "+num2);


    }
}
