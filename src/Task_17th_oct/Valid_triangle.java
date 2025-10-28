package Task_17th_oct;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Valid_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 sides of triangle");
        int a= sc.nextInt(); int b=sc.nextInt();  int c=sc.nextInt();
        if (a+b>c && b+c>a && c+a>b)
        {
            System.out.println("valid triangl");
        }
        else
        {
            System.out.println("invalid triangle");
        }
    }
}
