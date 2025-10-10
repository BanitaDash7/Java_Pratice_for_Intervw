package Max_no;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Chk_maxno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a,b;
        System.out.println("entr a & b in integer");
    a=sc.nextInt();
    b=sc.nextInt();
    if (a>b) {
        System.out.println("max is" +a);
    }
    else {
            System.out.println(" max is " +b);
    }
    }
    }

