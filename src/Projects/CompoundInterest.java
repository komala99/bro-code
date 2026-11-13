package Projects;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        //compound interest
        //A=p*(1+r/n)^nt;

        Scanner sc=new Scanner(System.in);

        double amount;
        int principal;
        double rateOfInterest;
        int timesCompound;
        int n;

        System.out.println("Enter principal principal");
        principal=sc.nextInt();
        System.out.println("Enter principal rateOfInterest");
        rateOfInterest=sc.nextDouble()/100;
        System.out.println("Enter times compound");
        timesCompound=sc.nextInt();
        System.out.println("Enter principal n");
        n=sc.nextInt();

        amount=principal*Math.pow(1+rateOfInterest*n,n*timesCompound);

        System.out.println("compound interest :"+amount);

    }
}
