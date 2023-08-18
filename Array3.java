
import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        int [] ar=new int [5];
        Scanner scan = new Scanner (System.in);
        for(int i=0;i<ar.length;i++){
            System.out.println("Enter the marks of Students");
            ar[i]=scan.nextInt();
        }
        System.out.println("The marks of students are");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]+" ");
        }


    }
}
