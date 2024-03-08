package day01;

public class P09_IncrementandDecrement {
    public static void main(String[] args) {
       //In the first one, it would increase its value in the next line, so its value remained 10, in the second one, the previous increment became 11 with +1, and with the preincrement here, its value changed in the same line and became 12.
    /*
            number = 10;
            int result = number ++ ;
            result = 10;
            number = 11

         */

       // System.out.println(number++);  //10 post increment //int result = number++;
        /*
            number = 11;
            int result = ++number ;
            result = 12;
            number = 12

         */

        //System.out.println(++number); //12 pre increment n

        /*
            number = 12;
            int result = number -- ;
            result = 12;
            number = 11

         */
      //  System.out.println(number--); //12  result = number --

        /*
            number = 11;
            int result = --number ;
            result = 10;
            number = 10

         */
      //  System.out.println(--number); //10  result = --number


    }
}
