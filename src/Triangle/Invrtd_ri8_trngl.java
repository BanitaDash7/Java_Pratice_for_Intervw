package Triangle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Invrtd_ri8_trngl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the n vlue");
        int n=sc.nextInt();
        for(int i=n; i>0; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
