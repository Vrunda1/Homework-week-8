package homeworkweek_8;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Program6 obj = new Program6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of raws:");
        int raws = sc.nextInt();
        obj.triangle(raws);
    }

    public void triangle(int a) {
        //for loop for raw and column to print in right triangle
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            {
            }
            System.out.println();
        }
    }
}