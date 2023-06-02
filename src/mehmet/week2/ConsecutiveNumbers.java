package mehmet.week2;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        consecutiveNumbers(20);
    }

    public static void consecutiveNumbers(int num){

        for (int i = 1; i <= num; i++){
            if ( i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                if (i % 2 == 0)
                    System.out.print("Codility ");
                if (i % 3 == 0)
                    System.out.print("Test ");
                if (i % 5 == 0)
                    System.out.print("Coders ");
            }else
                System.out.print(i);

            System.out.println();
        }
    }
}
