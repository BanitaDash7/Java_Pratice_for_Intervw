package Task_24;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a  url ");
        String url=sc.nextLine();
        if (url.endsWith(".com"))
        {
            System.out.println(" this is a commercial website");
        }
        else  if (url.endsWith(".edu"))
        {
            System.out.println(" this is a education wbsite");
        }
        else  if (url.endsWith(".govt"))
        {
            System.out.println(" this is a govt website");
        }
        else  if (url.endsWith(".net"))
        {
            System.out.println(" this is a network related website");
        }
        else  if (url.endsWith(".info"))
        {
            System.out.println(" this is a informationl website");
        }
        else {
            System.out.println("invalid entered website");
        }
    }
}
