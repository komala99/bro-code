package MathClass;

import java.util.Scanner;

public class Area {
    public  static void main(String[] args){
        //circumference= 2* Math.PI *radius;
        //area=Math.PI *Math.pow(radius,2);
        //volume=(4.0/3.0)*Math.PI*math.pow(radius,3);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of the circle :");
        double radius=sc.nextDouble();

        double circumference=2*Math.PI*radius;
        System.out.println("Circumference of the circle:"+circumference+"cm^2");

        double area=Math.PI*Math.pow(radius,2);
        System.out.println("Area of the circle :"+area);

        double volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.println("volume of the circle :"+volume);

    }
}
