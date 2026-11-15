package Projects;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;
        System.out.println("Enter temperature :");
        temp=sc.nextDouble();

        System.out.println("Enter unit to convert Celsius or Fahrenheit(F or C) :");
        unit=sc.next().toUpperCase();

        newTemp=(unit.equals("C"))? (temp-32)*5/9 :(temp*5/9)+32;
        System.out.printf("%.2f%s ",newTemp,unit);
    }
}
