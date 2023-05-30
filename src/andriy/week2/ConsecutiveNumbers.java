package andriy.week2;

import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Enter you number:");
    int num = input.nextInt();
        input.close();

        for (int i = 0; i <= num; i++) {
        if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
            System.out.println("CodilityTestCoders -" + i);
        } else if (i % 2 == 0 && i % 5 == 0) {
            System.out.println("CoditilityCoders -" + i);
        } else if (i % 2 == 0 && i % 3 == 0) {
            System.out.println("CodilityTest -" + i);
        } else if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("CodersTest -" + i);
        } else if (i % 2 == 0) {
            System.out.println("Coditility -" + i);
        } else if (i % 3 == 0) {
            System.out.println("Test -" + i);
        } else if (i % 5 == 0) {
            System.out.println("Coders -" + i);
        } else {
            System.out.println(i);
        }
    }
}
}
/*
Numbers – Print Consecutive Numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
 Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5,
 it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

EX:
Numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers,
 2,3 and 5, should be replaced by CodilityTestCoders.
 */

