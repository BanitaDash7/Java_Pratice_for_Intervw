package Postv_ngtv;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Chk_posOrneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("entr a no");
        num=sc.nextInt();
        if (num>0) {
            System.out.println("+ve no. enterd");
        }
        else {
            System.out.println("-ve no enterd");
        }
    }
}
