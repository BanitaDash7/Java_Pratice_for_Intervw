package Task_24;

import java.util.Scanner;

public class Divisble_by_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter totalno.of days ");
        int totaldays = sc.nextInt();
        int year,month,days;
        if (totaldays>0) {
            year = totaldays / 365;
            totaldays = totaldays % 365;

            month = totaldays / 30;
            days = totaldays % 30;
          //  days=totaldays;

            System.out.println(year + " year "  + month + " month " + days + " days");
        }
        else {
            System.out.println("input no. should be +ve");
        }


        }

}