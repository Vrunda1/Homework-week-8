package homeworkweek_8;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Program10 obj10=new Program10();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
        System.out.println(obj10.armstrong(number));
    }
    public String armstrong(int num){
        double sum=0;
        int digit=0;
        int last=0;
        String msg;

        int temp=num;
        while(temp>0){
            //finding lenght of given number
            temp=temp/10;
            digit++;
        }
        temp=num;
        while (temp>0){
            last=temp%10;//finding last digit
            sum=sum=(Math.pow(last,digit));
            temp=temp/10;//remove last digit
        }
        if(num==sum) {
            msg = "Given number is  Armstrong";
        }else
            msg="Given number is not Armstrong";
        return msg;
        }

    }


