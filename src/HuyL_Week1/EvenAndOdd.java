package HuyL_Week1;

public class EvenAndOdd {

    public static void evenOrOdd(int number){

        if (number<=0){
            System.out.println("Number can not be zero or negative ");
            System.exit(1);
        }else {
            if (number%2 == 0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        }
    }
}

