package Even_odd;

import java.util.Scanner;

public class Check_Evn_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num;
        System.out.println("entr a no.");
        num=sc.nextInt();
        if( num%2==0)
        {
            System.out.println("evn no. enterd");
        }
        else
        {
            System.out.println("odd no enterd");
        }
        }
    }

