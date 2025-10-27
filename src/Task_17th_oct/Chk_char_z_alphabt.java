package Task_17th_oct;

import java.util.Scanner;

public class Chk_char_z_alphabt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr an alphabet");
        char ch=sc.next().charAt(0);
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.println(ch+ " is an aplha");
        }
        else{
            System.out.println("wrong input");
        }
    }
}
