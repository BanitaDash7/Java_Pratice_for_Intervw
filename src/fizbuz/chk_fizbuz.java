package fizbuz;
import java.sql.SQLOutput;
import java.util.Scanner;
    public class chk_fizbuz {
        public static void main(String[] args) {
            int i;
            Scanner sc=new Scanner(System.in);
            System.out.println("entr a no between 1 to 100");
            i=sc.nextInt();
   // for(i=1;i<=100; i++)


                if(i%3==0 && i%5==0) {
                    System.out.println("fizzbuz");

                } else if (i%5==0) {
                    System.out.println("buzz");
                }
                else if (i%3==0)
                {
                    System.out.println("fiz");
                }
                else {
                    System.out.println("print i =" + i);
//sc.close();
            }
        }}






