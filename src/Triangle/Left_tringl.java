package Triangle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Left_tringl {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("entr the n value to print the pattern");
        int n;
        n=sc.nextInt();
        for(int i=0; i<n; i++)
        {

            for (int j=0; j<=i; j++)
            {
            System.out.print("*");
        }
            System.out.println(" ");
        }
    }
}
