package day01;

import java.util.Scanner;

public class P05_Scanner {
    public static void main(String[] args) {
        //Ask user to enter height and width of rectangle,
        // and print area and perimeter of rectangle
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width of the rectangle: ");
        double width = scan.nextDouble();
        System.out.println("Enter height of the rectangle: ");
        double height = scan.nextDouble();

        double areaOfRectangle = width * height;
        double perimeterOfRectangle = (width+height)*2;

        System.out.println("The area of rectangle is: "+ areaOfRectangle+ ". Perimeter of rectangle is: "+perimeterOfRectangle);





    }
}
