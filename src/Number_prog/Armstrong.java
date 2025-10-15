package Number_prog;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr a no");
        int number, num, temp, total=0;
        num=sc.nextInt();
         number=num;
         while(number!=0) {
             temp = number % 10;
             total = total + temp * temp * temp;
             number = number / 10;
         }
         if (total== num)
             System. out.println (num +  "is arm");
         else
             System.out.println("not arm");
         }
    }

