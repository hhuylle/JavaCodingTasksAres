package week1.andriyH;


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

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        oddOrEven(input.nextInt());
        input.close();
    }
    public static void oddOrEven(int num){
        if (num % 2 == 0) {
            System.out.println("Your number " + num + " is even");
        } else {
            System.out.println("Your number "+ num+" is odd");

        }
    }
}
