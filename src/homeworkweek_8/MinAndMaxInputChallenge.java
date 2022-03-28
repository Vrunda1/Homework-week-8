package homeworkweek_8;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.minmax();
    }

    public void minmax() {

        Scanner sc1 = new Scanner(System.in);
        int count = 0;
        int min = 0;
        int max = 0;
        boolean b = true;

        while (true) {
            int c = count++;
            System.out.println("Enter number: " + c);
            boolean isvalid = sc1.hasNextInt();
            if (isvalid) {
                int num = sc1.nextInt();
                if (b) {
                    b = false;
                    min = num;
                    max = num;
                }
                //checking number is min or max
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            } else {
                System.out.println("Invalid number");
                break;
            }
            sc1.nextLine();
        }
        System.out.println("Min number" + min);
        System.out.println("Max number" + max);
    }

}


