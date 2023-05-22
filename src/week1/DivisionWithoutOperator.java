package week1;


import java.util.Scanner;

public class DivisionWithoutOperator {
    /*
    Numbers -- Divide without / operator
            => Write a method that can divide two numbers without using division operator.
     */

    // Solution Below

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int divindend = input.nextInt();

        System.out.println("Enter your second number: ");
        int divisor = input.nextInt();

        try {
            divisionWithoutOperator(divindend, divisor);
        } catch (RuntimeException e) {
            System.err.println("Divisor can not be 0");

            System.out.println("Try again");

            System.out.println("Enter your first number: ");
            divindend = input.nextInt();

            System.out.println("Enter your second number: ");
            divisor = input.nextInt();

            divisionWithoutOperator(divindend, divisor);
        }


        input.close();
    }


    public static void divisionWithoutOperator(int dividend, int divisor) {
        int result = 0;
        int reminder = dividend % divisor;

        if (divisor == 0) {
            throw new RuntimeException();
        } else {

            while (dividend >= divisor) {
                dividend -= divisor;
                result++;
            }
            System.out.println(result + " with reminder " + reminder);

        }
    }
}