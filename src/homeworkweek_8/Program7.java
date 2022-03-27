package homeworkweek_8;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = st.nextInt();
        System.out.println(Program7.sumFirstAndLast(num));

    }

    public static int sumFirstAndLast(int number) {
        int firstdigit = 0;
        int lastdigit = 0;
        int sum = 0;

        //find last digit
        lastdigit = number % 10;
        System.out.println("last digit:" + lastdigit);
        if (number > 0) {
            while (number != 0) {
                firstdigit = number % 10;
                number /= 10;
            }
        } else {
            return -1;
        }
        sum = firstdigit + lastdigit;
        System.out.println("first  digit " + firstdigit + "and last digit " + lastdigit + "and the sum is " + sum);

        return sum;
    }
}
