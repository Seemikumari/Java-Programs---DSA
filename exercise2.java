import java.util.Random;
import java.util.Scanner;



public class exercise2 {
    public static void main(String[] args) {
        //0 for rock
        // 1 for scissor
        // 2 for paper
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for scissor, 2 for paper");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("draw");
        }else if(userInput==0 && computerInput==1 || userInput==1 && computerInput==2 || userInput==2&& computerInput==0){
            System.out.println("YOU WON");
        }else{
            System.out.println("BOOT WON ");
        }


    }
}
