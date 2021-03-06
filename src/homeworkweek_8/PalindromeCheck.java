package homeworkweek_8;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter any number");
        int inputnum = sc5.nextInt();
        System.out.println(isPalindrome(inputnum));

    }

    public static boolean isPalindrome(int number) {
        int sum = 0;
        int temp = number;//store number in temp variable
        boolean message;

        while (number != 0) {
            int b = number % 10;//find last digit
            sum = (sum * 10) + b;
            number = number / 10;//to get least bit
        }
        //condition to check Palindrome number
        if (temp == sum)
            message = true;
        else
            message = false;
        return message;
    }


}
