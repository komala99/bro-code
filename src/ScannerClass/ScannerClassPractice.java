package ScannerClass;

import java.util.Scanner;

public class ScannerClassPractice {
    public static void main(String[] args) {

        //Scanner is an object which allow to receive input from user
        //to use Scanner we need to import Scanner class
        //it belongs to java.util package
        //it provides specific method to accept different kind of data
        //nextInt()->to accept integer
        //nextLine()->to accept Strings
        //nextBoolean()->to accept boolean user input
        //nextDouble()
        //nextFloat()
        //next()->reads single word, and it doesn't read any spaces
        //next().charAt() ->to reads char data
        //these all are scanner class methods

        //creating object for Scanner class
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter you name :");
        String name=sc.nextLine();
        System.out.println(name);

        System.out.println("Enter your age :");
        int age=sc.nextInt();
        System.out.println(age);

        System.out.println("What is your height :");
        double height=sc.nextDouble();
        System.out.println(height);

        System.out.println("What is your gpa :");
        float gpa=sc.nextFloat();
        System.out.println(gpa);

        System.out.println("Are you a student(true/false) :");
        boolean isStudent=sc.nextBoolean();
        System.out.println(isStudent);


        if(isStudent){
            System.out.println("You are enrolled under student program");
        }else{
            System.out.println("You not enrolled under an student program");
        }


        //close Scanner
        sc.close();
    }
}
