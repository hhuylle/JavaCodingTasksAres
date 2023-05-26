package week1.andriyH;

import java.util.Scanner;

public class FinRa {

    /*
    Numbers -- FINRA
        => Write a method that prints out the numbers from 1 to 30 but;
            - for numbers which are multiple of 3 print "FIN" instead of the number,
            - for numbers which are multiple of 5, print "RA" instead of the number,
            - and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    // Solution below

    public  static void finra(int num){
        if (num>=1 && num<=30){
            if (num%3==0 && num%5==0){
                System.out.println("FINRA");
            }else if( num%3==0){
                System.out.println("FIN");
            }else{
                System.out.println("RA");
            }
        }else{
            System.err.println("Invalid number");
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        finra(input.nextInt());
        input.close();
    }
}
