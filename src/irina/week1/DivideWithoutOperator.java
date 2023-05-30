package irina.week1;

public class DivideWithoutOperator {

     /*
    Numbers -- Divide without / operator
            => Write a method that can divide two numbers without using division operator.
     */

    // Solution Below

    public static void divisionWithoutOperator(int x, int y){

        int result = 0;

        while(x > 0 && x >= y){
            x -= y;
            result++;
        }

        System.out.println(result);
}
