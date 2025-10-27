package Task_17th_oct;

import java.sql.SQLOutput;
import java.util.Scanner;

public class smallestno_between_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 value");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        if (a<b && a<c) {
            System.out.println(a+ " is smallest");
        }
        else if (b<a && b<c)
        {
            System.out.println(b+ " is smalest");
        }
        else{
            System.out.println(c+ " is smallest");
        }
    }
}
