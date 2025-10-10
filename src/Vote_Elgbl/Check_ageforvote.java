package Vote_Elgbl;

import java.util.Scanner;

public class Check_ageforvote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("entr age of a person");
        age=sc.nextInt();
        if (age>18)
        {
            System.out.println("this person is elgible ");
        }
    else{
            System.out.println("not elgble bcz person is below 18 ");

    }
}}

