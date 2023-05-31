package irina.week1;

public class OddOrEven {
     /*
    Numbers -- odd & even
        => Write a method that can identify  a given number is even or odd.
            EX:
                identify(5) --> "Odd"
                identify(6) --> "Even"
     */

    // Solution below

    public static String evenOrOdd(int x) {
        String result = "The number is: ";
        if (x % 2 == 0) {
            result += "even";
        } else {
            result += "odd";

        }
        return result;
    }
}
