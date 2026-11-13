package MathClass;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class TrangleProgram {
    public static void main(String[] args){
        //HYPOTENUSE c=Math.sqrt(a^2 + b^2)
        Scanner sc=new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter side a :");
        a=sc.nextDouble();

        System.out.print("Enter side b :");
        b=sc.nextDouble();

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Hypotenuses of the right angle triangle(side c) :"+c+ "cm");




    }
}
