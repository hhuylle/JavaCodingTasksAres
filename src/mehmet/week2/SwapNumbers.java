package mehmet.week2;

public class SwapNumbers {
    public static void main(String[] args) {

        swap2Numbers(199, 200);

    }

    public static void swap2Numbers(int num1, int num2) {
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Numbers swapped " +
                "\nNum1: " + num1 +
                "\nNum2: " + num2);
    }
}
