package Task_17th_oct;

import java.util.Scanner;

public class Greatest_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter three no");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        if (a>b && a>c)
        {
            System.out.println(a+ "is greatest");
        }
        else if (b>a && b>c)
        {
            System.out.println(b + "is greatst");
        }
        else {
            System.out.println(c + "is grtst");
        }
    }
}
