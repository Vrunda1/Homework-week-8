package homeworkweek_8;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Program14 obj = new Program14();
        obj.diamond();

    }

    public void diamond() {
        Scanner sc14 = new Scanner(System.in);
        System.out.println("Enter no. of raws:");
        int n = sc14.nextInt();
        System.out.print("Enter Symbol: ");
        char c = sc14.next().charAt(0);
        int i = 1;
        int j;
        while (i <= n) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);

            }
            System.out.println(" ");
            i--;
        }
    }
}

