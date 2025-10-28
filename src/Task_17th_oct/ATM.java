package Task_17th_oct;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double amount=10000d;
        System.out.println("input the amount want to widrw");
        double widrwamount= sc.nextDouble();
        if(widrwamount<=0)
        {
            System.out.println("the widrwamount should be greater than 0");
        }
        else if (widrwamount%100!=0)
        {
            System.out.println( widrwamount+ " must be multiple 0f 100");
        }
        else if (widrwamount>amount)
        {
            System.out.println( "insufficnt amount");
        }
        else {
            amount -=widrwamount;
            System.out.println("succesfully withdrw \nRemaining balanc is " +amount);
        }

    }
}
