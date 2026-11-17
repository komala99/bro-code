package WhileLoop;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age;

        System.out.println("Enter you age :");
        age=sc.nextInt();

        while (age<0){
            System.out.println("Age can't be negative");

            System.out.println("Enter you age :");
            age=sc.nextInt();

        }

        /*

        do{
            System.out.println("Age can't be negative");

            System.out.println("Enter you age :");
            age=sc.nextInt();

        }while (age<0);

         */
        System.out.println("your are "+age+" year's old!");
    }
}
