package ifstatements;

import java.util.Scanner;

public class ConditionalIf {
    //conditional if statement performs a block of code if its condition is true
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your name :");
        String name=sc.nextLine();

        boolean isStudent;
        System.out.println("Are you student(true/false) :");
        isStudent=sc.nextBoolean();
        //GROUP1
        //isEmpty is a build in method to check if string is empty
        if(name.isEmpty()){
            System.out.println("name can't be empty");
        }else {
            System.out.println("hello "+name);
        }

        //GROUP 2
        if(age>=18){
            System.out.println("Adult");
        } else if (age>60) {
            System.out.println("Senior");
        } else if(age<0){
            System.out.println("you haven't born yet");
        }else {
            System.out.println("you are a child");
        }
        //else acts like a default code if none of condition is true

        //GROUP3

        if(isStudent){
            System.out.println("You are welcome to join the course");
        }else{
            System.out.println("You're not enrolled");
        }



    }



}

