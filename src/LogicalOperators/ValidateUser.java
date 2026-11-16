package LogicalOperators;

import java.util.Scanner;

public class ValidateUser {
    public static void main(String[] args){
        //username must be between 4-12 characters
        //username must not contain spaces or underscore
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username :");
        String username=sc.nextLine();

        if(username.length()<4|| username.length()>12){
            System.out.println("username must be between 4-12 character");
        } else if (username.contains(" ")|| username.contains("_")) {
            System.out.println("username must not contain spaces or underscore");
        } else {
            System.out.println("welcome "+username);
        }
    }
}
