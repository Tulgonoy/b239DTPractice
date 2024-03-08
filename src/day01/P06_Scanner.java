package day01;

import java.util.Scanner;

public class P06_Scanner {
    public static void main(String[] args) {
        //ask user to enter radius of circle, and calculate perimeter and area of circle

        //area of circle:  Pi * r *r
        //perimeter of circle : 2 * Pi *r

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius for the circle: ");
        double r = scan.nextDouble();
        double areaOfCircle = Math.PI * r *  r;
        double perimeterOfCircle = 2 * Math.PI * r;

        System.out.println("The area of circle is: "+ areaOfCircle + ". Perimeter of circle is: "+perimeterOfCircle);

    }
}
