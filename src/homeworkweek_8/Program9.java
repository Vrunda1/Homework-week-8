package homeworkweek_8;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Program9.fibonacci();
    }
    public static void fibonacci() {
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.println("Enter Fibonacci series till " + n);

        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + ",");

            //calculate next term
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
