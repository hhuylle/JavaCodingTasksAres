package laila.week1;

import java.util.Scanner;

public class OddOrEven {

    /*
    Numbers -- odd & even
        => Write a method that can identify  a given number is even or odd.
            EX:
                identify(5) --> "Odd"
                identify(6) --> "Even"
     */

    // Solution below
    public static void main(String[] args) {
        int num1 = 4;
        int num2 =9;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();

        // also can put the : System.out.println(input.nextInt());

        System.out.println(evenOrOdd(num1));
        System.out.println(evenOrOdd(num2));
        System.out.println(evenOrOdd(num));


    }
    public static String evenOrOdd(int num){

       if(num % 2==0){
           return "Even";
       }
        return "Odd";
    }
}
