package ScannerClass;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){

        //calculate area of rectangle

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width of rectangle");
        double width=sc.nextDouble();

        System.out.println("Enter height of rectangle");
        double height= sc.nextDouble();

        double area=width*height;
        System.out.println("Area of rectangle is :"+area+" cm^2");
    }
}
