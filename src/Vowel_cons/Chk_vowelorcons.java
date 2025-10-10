package Vowel_cons;

import java.util.Scanner;

public class Chk_vowelorcons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch;
        System.out.println("enter a charecter");
        ch=sc.next();
        if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e")|| ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o")|| ch.equalsIgnoreCase("u"))
        {
            System.out.println("vowl entrd");
        }
        else {
            System.out.println("cons");
        }
    }
}
