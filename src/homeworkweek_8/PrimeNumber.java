package homeworkweek_8;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        PrimeNumber obj = new PrimeNumber();
        obj.primeno(n);

    }

    public void primeno(int a) {

        int result = 0;
        for (int i = 2; i <= a / 2; i++) {
            if (a % 2 == 0) {
                result = 0;
                break;
            } else
                result = 1;
        }
        if (result == 0) {
            System.out.println("This not prime number");
        } else
            System.out.println("This is prime number");
    }
}
