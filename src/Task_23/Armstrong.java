package Task_23;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int num = sc.nextInt();
        int temp;
        int sum = 0;
        int number;
        number = num;
        while (num > 0)
        {
            temp = num % 10;
         sum = sum + temp * temp * temp;
            num = num / 10;
        }
        if (number== sum ) {
            System.out.println("armstrong");
        } else {
            System.out.println("not");
        }
    }
}