package homeworkweek_8;

import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        TriangleNumber obj = new TriangleNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of raws:");
        int raws = sc.nextInt();
        obj.triangle(raws);
    }

    public void triangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            {
            }
            System.out.println();
        }
    }
}