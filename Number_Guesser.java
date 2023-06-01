import java.util.Random;
import java.util.Scanner;

class game{
    int number;
    int inputNumber;
    int noOfGuess = 0 ;

    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInut(){
        System.out.print("Guess the Number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuess++;
        if (inputNumber==number){
            System.out.format("You guessed it Correctly!!\n The Number was %d and you guessed it in '%d' attempts.",number,noOfGuess);
            System.out.println();
            return true;
        }
        else if (inputNumber>number) {
            System.out.println("Not that high");
            System.out.println();
        }
        else if (inputNumber<number) {
            System.out.println("Think Higher");
            System.out.println();
        }
        return false;
    }
}

public class Java_50_Game_Number_Guesser {
    public static void main(String[] args) {
        System.out.println("Gave in Java: Number Guesser");
        System.out.println("Guess the number from 0 to 100");
        System.out.println(" ");

        game G = new game();
        boolean b =false;
        while (!b) {
            G.takeUserInut();
            b = G.isCorrectNumber();
        }
    }
}