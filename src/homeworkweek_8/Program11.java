package homeworkweek_8;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numsum = sc.nextInt();

        if (getEvenDigitSum(numsum) != 1) {
            System.out.println("The sum of even digits of the number " + numsum + " is:" + getEvenDigitSum(numsum));
        } else {
            System.out.println("Invalid input " + getEvenDigitSum(numsum));
        }
    }

    public static int getEvenDigitSum(int number) {
        int lastdigit;
        int sum = 0;
        if (number > 0) {
            while (number > 0) {
                lastdigit = number % 10;//sepearting last digit
                if (lastdigit % 2 == 0)//to get odd or even number if even then add
                {
                    sum = sum + lastdigit;
                }
                number = number / 10;
            }
        } else
            sum = -1;
        return sum;
    }
}
