package irina.week1;

public class FINRA {

    /*
    Numbers -- FINRA
        => Write a method that prints out the numbers from 1 to 30 but;
            - for numbers which are multiple of 3 print "FIN" instead of the number,
            - for numbers which are multiple of 5, print "RA" instead of the number,
            - and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    // Solution below

    public static void FINRA(int[] x ){

        for (int each : x) {
            if ( each % 3 == 0 && each % 5 == 0){
                System.out.println("FINRA");
            } else if ( each % 3 == 0){
                System.out.println("FIN");
            } else if ( each % 5 == 0){
                System.out.println("RA");
            } else {
                System.out.println(each);
            }



        }


    }
}
