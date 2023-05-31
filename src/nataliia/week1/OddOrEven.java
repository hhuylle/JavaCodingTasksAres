package Nataliia.week1;

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
            System.out.println("Enter a number");
            Scanner scan = new Scanner (System.in);
            int num = scan.nextInt();
            if(num %2 == 0) {
                System.out.println("Even number " + num);
            } else {
                System.out.println("Odd numbers " + num);
            }

        }
    }





