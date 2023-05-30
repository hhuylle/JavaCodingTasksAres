package week1;

import java.util.Scanner;

public class DivisionWithoutOperator {
    /*
    Numbers -- Divide without / operator
            => Write a method that can divide two numbers without using division operator.
     */

    // Solution Below

    public static void main(String[] args) {
        System.out.println("Enter a numerator");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        System.out.println("Enter a denominator");
        int num2 = scan.nextInt();
        int numberOfIterations = 0;

        while (num1 >= num2) {
            num1 -= num2;
            numberOfIterations ++;
        }
        System.out.println(numberOfIterations);
    }

}

