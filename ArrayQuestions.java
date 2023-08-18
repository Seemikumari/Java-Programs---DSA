import java.util.Scanner;

//To store and display the marks of 3 classes  students each with 4 students
public class ArrayQuestions {
    public static void main(String[] args) {
        int [][] ar=new int[3][4];
        Scanner scan = new Scanner(System.in);
        for(int i =0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println("Enter the marks of class" + i +"student" + j);
                ar[i][j]=scan.nextInt();

            }
        }
        System.out.println("The marks of students are");
        for(int i =0;i<ar.length;i++){
            for(int j =0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
