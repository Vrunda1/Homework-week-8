package homeworkweek_8;

import javafx.scene.transform.Scale;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Program3 obj3 = new Program3();
        obj3.alphabet();
    }

    public void alphabet() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter any character:");
        String s = sc2.nextLine();
        String s1 = s.toLowerCase(Locale.ROOT);
        char ch = s1.charAt(0);
        boolean flag = Character.isAlphabetic(ch);
        //checking if character is vowel or consonent
        if (s1.length() == 1 && flag) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println(ch + "is a vowel");
            else
                System.out.println(ch + "  is a consonent");
        } else {
            System.out.println();
        }
    }
}






