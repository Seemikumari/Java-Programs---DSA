import java.util.Scanner;
//we need 5 objects:- umpire, guesser,P1,P2,P3
//JVM is responsible to create objects in java
class Umpire{
    int numGuess;
    int numP1;
    int numP2;
    int numP3;
    public void getNumberFrommGuesser(){
        Guesser guesser = new Guesser();
        numGuess =guesser.guessNumber();
        
    }

    public void collectFromPlayers() {
    }

    public void calculateResult() {
    }
}
class Guesser{
    int numGuess;
    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Guesser, guess the number");
        numGuess =sc.nextInt();
        return 0;
    }
}
class Player{

}

public class LaunchGame {
    public static void main(String[] args) {
        Umpire umpire= new Umpire();
        umpire.getNumberFrommGuesser();
        umpire.collectFromPlayers();
        umpire.calculateResult();

    }
}
