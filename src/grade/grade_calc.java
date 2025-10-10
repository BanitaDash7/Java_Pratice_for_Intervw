package grade;

import java.util.Scanner;

public class grade_calc {
    public static void main(String[] args) {

            {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter marks of the student: ");
                int marks=sc.nextInt();
                char grade=' ';

                if(marks >=90 && marks<=100)
                    System.out.println("grade='A' ");
                else if(marks>=80 && marks<=89)
                    System.out.println("grade='B' ");
                else if(marks>=70 && marks<=79)
                    System.out.println("grade='C' ");
                else if(marks>=60 && marks<=69)
                System.out.println("grade='D'");
                else if(marks<=59)
                System.out.println("grade='F' ");
                else
                System.out.println("plz enter valid mark");

              //  sc.close();
}}}
