package homeworkweek_8;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of raws to print :");
        int star = scan.nextInt();
        Program15.startriangle(star);

    }

    public static void startriangle(int n) {
        //print right triangle for * symbol
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
