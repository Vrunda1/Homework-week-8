package homeworkweek_8;

import java.util.Scanner;

public class DigitSumChallenge {
    public static void main(String[] args) {
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc4.nextInt();
        System.out.println(sumDigits(num));

    }

    //static method with return type,with parameter
    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                int b = number % 10;//find last digit
                sum = b + sum;//addition
                number = number / 10;
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}