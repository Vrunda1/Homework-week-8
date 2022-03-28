package homeworkweek_8;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second method");
        int n2 = sc.nextInt();
        System.out.println(Program13.hasSharedDigit(n1, n2));
    }

    public static boolean hasSharedDigit(int a, int b) {

        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        while ((a > 0)) {
            int lastDigit1 = a % 10;//last digit from last number1
            int lastDigit2 = b % 10;//last digit from last number2
            int firstDigit1 = a / 10;//first digit from first number1
            int firstDigit2 = b / 10;//first digit from first number2
            //condition to check shared digit
            if ((lastDigit1 == lastDigit2) || (lastDigit1 == firstDigit2) || (firstDigit2 == lastDigit1) || (firstDigit1 == lastDigit2)) {
                return true;
            }
            a /= 10;
            b /= 10;
        }
        return false;

    }
}

