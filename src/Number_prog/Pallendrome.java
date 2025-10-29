package Number_prog;

import java.util.Scanner;

public class Pallendrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a no.");
        int num=sc.nextInt();
        int rev=0, temp,rem;
         temp=num;
         while(num>0)
         {
             rem=num%10;
             rev=rev*10+rem;
             num=num/10;
         }
        if (temp==rev)
        {
            System.out.println( " is pallendrom");
        }
        else {
            System.out.println( " is not pallendrom");
        }
    }
}
