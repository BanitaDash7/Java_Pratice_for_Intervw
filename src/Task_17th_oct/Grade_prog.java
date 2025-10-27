package Task_17th_oct;

import java.util.Scanner;

public class Grade_prog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your mark between 0 to 100");
        int mark= sc.nextInt();
        if(mark >=90 && mark<=100) {
            System.out.println("grade= +A ");
        }
            else if (mark>=80 && mark<=89)
        {
            System.out.println("grade= A");
        }
        else if (mark>=70 && mark<=79)
        {
            System.out.println("grade= B");
        }

        else if (mark>=60 && mark<=69){
            System.out.println("grade= C");
        }

        else if (mark>=50 && mark<=59)
        {
            System.out.println("grade= D");
        }

        else if (mark>=40 && mark<=49)
        {
            System.out.println("grade= E");
        }

        else if (mark>0 && mark<40)
        {
            System.out.println("fail");
        }
        else {
            System.out.println("wrong input");
        }
        }
    }

