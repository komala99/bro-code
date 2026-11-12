package ScannerClass;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args){
        //COMMON ISSUES
        //when we type a number within input buffer still newline character
        //after reading int,double,float we need to use nextline() to avoid this problem

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you age :");
        int age=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your favorite color :");
        String color=sc.nextLine();

        System.out.println(age);
        System.out.println(color);

        sc.close();

    }
}
