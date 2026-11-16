package Projects;

import java.util.Scanner;

public class ValidateOperator {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number :");
        int a=sc.nextInt();
        System.out.println("Enter Operator[+,_,*,/,%] :");
        char operator=sc.next().charAt(0);
        System.out.println("Enter second number :");
        int b=sc.nextInt();

        double result=0;

        switch (operator){
            case '+':
                result =a+b;break;
            case '-':
                result =a-b;break;
            case '*':
                result =a*b;break;
            case '/':
                result =a/b;break;
            case '%':
                result =a%b;break;
            default:
                System.out.println("Invalid Operator");


        }
        System.out.println("Result = "+result);

        sc.close();
    }
}
