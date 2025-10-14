package Number_prog;

import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no. upto print");
        int n=sc.nextInt();
        int f=0;
        int s=1;
        int t=1;
       System.out.println(f);
        for(int i=2; i<=n; i++) {
            f = s;
            s = t;
            t = f + s;

            System.out.println(f);
           // n++;

        }
    }
}
