package irina.week2;

public class SwapNumbers {

    /*
    Numbers – Swap Numbers
           Swap two variables' values without using a third variable.
     */
    public static void main(String[] args) {
        int x = 7;
        int y = 10;

        x+=y;
        y = x-y;
        x-=y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
