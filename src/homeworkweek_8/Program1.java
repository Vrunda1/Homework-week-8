package homeworkweek_8;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.sumNumber();
    }
   //Instance method to count and sum numbers
    public void sumNumber() {

        int count = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        //while loop to count valid entered number
        while (count <= 10) {
            System.out.println("Enter number:" + count);
            boolean validno = sc.hasNextInt();

            if (validno) {
                int b = sc.nextInt();
                sum = sum + b;
                count++;
            } else {
                System.out.println("Invalid number");
            }

            sc.nextLine();
        }
        System.out.println("Sum of all numbers=" + sum);
    }
}




