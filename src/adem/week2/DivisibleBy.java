package adem.week2;
import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of N:");
        int N = scanner.nextInt();

        System.out.print("DivisibleBy15:");
        for (int i = 0; i <= N; i++) {
            if (i % 3 == 0 & i % 5 == 0 & i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nDivisibleBy3:");
        for (int i = 0; i <= N; i++) {
            if (i % 3 == 0 & i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nDivisibleBy5:");
        for (int i = 0; i <= N; i++) {
            if (i % 5 == 0 & i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}