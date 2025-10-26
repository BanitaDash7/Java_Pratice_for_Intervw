package Triangle_pattern;

import java.util.Scanner;

public class challng_tringl {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("entr the n vlue");
            int n=sc.nextInt();
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<=i; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
