package WhileLoop;

import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String response = "";
        while (!response.equals("C")){
            System.out.println("you are playing a game" );
            System.out.println("press C to quit");
            response=sc.nextLine().toUpperCase();

        }
        System.out.println("you quit the game");
    }
}
