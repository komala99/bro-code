package Randomclass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args){
        //Random class =similar pattern like a scanner class
        //Random object is used to generate random numbers

        //Random Object
        Random random=new Random();

        //Random int values
        int number1;
        int number2;
        int number3;
        number1=random.nextInt(1,6);
        number2=random.nextInt(1,6);
        number3=random.nextInt(1,6);
        //gives number between 1 and 6
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        //random double values
        double value;
        value=random.nextDouble();
        System.out.println(value);

        //random boolean values
        boolean isHeads;
        isHeads=random.nextBoolean();

        if (isHeads){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }



    }
}
