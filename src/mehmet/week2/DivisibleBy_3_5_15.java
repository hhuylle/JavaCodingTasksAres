package mehmet.week2;

public class DivisibleBy_3_5_15 {

    public static void main(String[] args) {

        System.out.println(divisible(100));
    }


    public static String divisible(int num) {

        String divisible3 = "Divisible By: ",
                divisible5 = "Divisible By: ",
                divisible15 = "Divisible By: ";

        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                divisible15 = divisible15 + " " + i;
            }
            else if (i % 5 == 0) {
                divisible5 = divisible5 + " " + i;
            }
            else if (i % 3 == 0) {
                divisible3 = divisible3 + " " + i;
            }
        }

        return divisible15 + "\n"
                + divisible5 + "\n"
                + divisible3;
    }
}
