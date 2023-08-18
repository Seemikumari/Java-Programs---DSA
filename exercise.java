import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {
        float total = 5;
        System.out.println("CALCULATOR");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total marks of the subject:");
        int totalMarks=input.nextInt();
        System.out.println("Enter marks of subject 1:");
        float s1=input.nextFloat();
        total=total+s1;
        System.out.println("Enter marks of subject 2:");
        float s2=input.nextFloat();
        total=total+s2;
        System.out.println("Enter marks of subject 3:");
        float s3=input.nextFloat();
        total=total+s3;
        System.out.println("Enter marks of subject 4:");
        float s4=input.nextFloat();
        total=total+s4;
        System.out.println("Enter marks of subject 5:");
        float s5=input.nextFloat();
        total=total+s5;
        float grandTotal = total*100/(totalMarks);
        System.out.println("your total percentage="+grandTotal+"percentage");



    }
}
