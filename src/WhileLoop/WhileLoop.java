package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        //while loop = repeat some code forever
        //while the condition remains true
        Scanner sc=new Scanner(System.in);
        String name="";

        while(name.isEmpty()){
            System.out.println("Enter your name :");
            name=sc.nextLine();
        }
        System.out.println("Name :"+name);
        sc.close();

    }
}
