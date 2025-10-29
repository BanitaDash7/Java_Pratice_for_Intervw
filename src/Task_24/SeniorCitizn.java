package Task_24;

import java.util.Scanner;

public class SeniorCitizn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age= sc.nextInt();
        if (age>=0&& age<=12) {
            System.out.println("the enterd age is child person");
        }
        else if (age>=13 && age<=19)
        {
            System.out.println("the enterd age is teenager person");
        }
        else if (age>=20 && age<=64)
        {
            System.out.println("the enterd age is adult person");
        }
        else if (age>=65)
        {
            System.out.println("the enterd age is Senior citizn person");
        }
        else {
            System.out.println("invalid age entered");
        }
    }
}
