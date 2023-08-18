import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception3 {
    public static void main(String[] args) {
//        String name = null;
//        Scanner sc = new Scanner (System.in);
//        name= sc.next();
//        sc.close();
        int  num = 0;
       Scanner sc = new Scanner (System.in);
       try {
           num = sc.nextInt();
       }
       catch(InputMismatchException e)
       {
           System.out.println("please enter number");
       }
       finally {
           sc.close();
       }
        System.out.println(num);

    }
}
