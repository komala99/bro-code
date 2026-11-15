package TernaryOperator;

public class TernaryOperator {
    public  static void main(String[] args){
        //ternary operator ?= return 1 of 2 values if the condition is true
        // variable=(condition)? ifTrue: ifFalse;

        int age=13;
/*
        if(age>=18){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
            }

 */

        String result=(age>=18) ? "Eligible":"Not eligible";
        System.out.println(result);

        int number=4;
        String evenOdd=(number%2==0)? "Even":"Odd";
        System.out.println(evenOdd);


    }
}
