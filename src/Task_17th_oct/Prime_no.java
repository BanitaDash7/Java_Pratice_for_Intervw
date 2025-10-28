package Task_17th_oct;

import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr a positiv no");
        int num = sc.nextInt();
        boolean isPrime=true;
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
               isPrime=false;
                System.out.println(num+ " is not a prime no");
                break;
            }
        }
      if(isPrime) {
                System.out.println(num+ " is prime no");
            }
        }
    }

