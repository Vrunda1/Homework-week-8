package homeworkweek_8;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of raws of @ triangle:  ");
        int raw = sc.nextInt();
        Program8 obj = new Program8();
        obj.triangleattherate((char) raw);
    }

    //Instance mehtod with no data type,with parameter
    public void triangleattherate(int a) {
        //for loop to print symbol in right triangle form
        for (int i = 1; i < a; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");

        }

    }
}
