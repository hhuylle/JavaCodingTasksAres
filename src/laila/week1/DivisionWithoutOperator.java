package laila.week1;

public class DivisionWithoutOperator {
    /*
    Numbers -- Divide without / operator
            => Write a method that can divide two numbers without using division operator.
     */

     public static void divideWithoutOperator(double a,double b){

             int count=0;
             while (a>=b) {
                  a-=b;
                 count++;
             }
             System.out.println(count+" reminder "+a);
         }


    public static void main(String[] args) {
        divideWithoutOperator(14,3);

    }


}
