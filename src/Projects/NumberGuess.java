package Projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){
        //number guessing game

        Random random=new Random();
        Scanner sc=new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min=1;
        int max=11;

        int randomNumber=random.nextInt(min,max);

        System.out.println("Number guessing game");
        System.out.println("Guess number between1-10");
        do {
            System.out.print("Enter a guess :");
            guess=sc.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("Too low! try again.");
            } else if (guess>randomNumber) {
                System.out.println("Too high! try again.");

            }else {
                System.out.println("Correct! the number was :"+randomNumber);
                System.out.println("Number of attempts :"+attempts);
            }
        }while (guess!=randomNumber);
        System.out.println("you have won");

    }
}
