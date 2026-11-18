package forLoops;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many time you want run loop:");
        int max=sc.nextInt();
        for (int i=0;i<max;i++){
            System.out.println(i);
        }
    }

}
