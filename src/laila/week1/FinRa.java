package laila.week1;



public class FinRa {

    /*
    Numbers -- FINRA
        => Write a method that prints out the numbers from 1 to 30 but;
            - for numbers which are multiple of 3 print "FIN" instead of the number,
            - for numbers which are multiple of 5, print "RA" instead of the number,
            - and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    // Solution below

    public static void finra(){
       /* for (int i =1 ; i<= 30 ; i++){
            if(i %3==0 && i % 5==0){
                System.out.println("FINRA");
            }else if (i % 5==0){
                System.out.println("RA");
            }else if (i%3==0){
                System.out.println("FIN");
            }else{
                System.out.println(i);
            }
        }
        */



    }

    public static void main(String[] args) {
       // finra();
        int[] array1 = {12,23,43,45,4,5,3};
        finra2(array1);
    }

    public static void finra2(int [] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.println((i%5 == 0 && i % 3==0)?"FINRA":(i % 5 == 0) ? "RA" : (i % 3 == 0) ? "FIN" : i);


        }}
}
