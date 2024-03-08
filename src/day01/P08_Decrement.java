package day01;

public class P08_Decrement {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("number: "+number);

        number = number-2;
        System.out.println("number: "+number); // 8

        number -= 2;
        System.out.println("number: "+number); // 6

        number--; // number-=1; number = number - 1;
        System.out.println("number: "+number); // 5

        int num = 4;

        int result = num --;  // (num = num-1) //post decrement

        System.out.println("num: "+ num); //3
        System.out.println("result: "+ result); //4

        result = --num; //(num = num -1)
        // pre decrement- first decrease the num, then assign new value to result

        System.out.println("num: "+ num);  //2
        System.out.println("result: "+ result); //2
    }
}
