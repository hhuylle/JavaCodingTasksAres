package adem.week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 35;
        int b = 15;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);

    }
}
