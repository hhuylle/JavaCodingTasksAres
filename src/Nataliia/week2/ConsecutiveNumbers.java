package nataliia.week2;
import java.util.Scanner;
public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        for (int num = 0; num < number; num++) {
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
                System.out.println("CodilityTestCoders: " + num);
            } else if (num % 2 == 0 && num % 3 == 0) {
                System.out.println("CodilityTest: " + num);
            } else if (num % 2 == 0 && num % 5 == 0) {
                System.out.println("CodilityCoders: " + num);
            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("TestCoders: " + num);
            } else if (num % 2 == 0) {
                System.out.println("Codility: " + num);
            } else if (num % 3 == 0) {
                System.out.println("Test: " + num);
            } else if (num % 5 == 0 ) {
                System.out.println("Coders: " + num);
            } else {
                System.out.println("Number that are not divisible by 2, 3, 5: " +num );
            }
        }
    }
}



