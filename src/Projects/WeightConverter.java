package Projects;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        //WEIGHT CONVERTER PROGRAM
        //WELCOME MESSAGE

        //PROMPT  FOR USER CHOICE

        //OPTION 1 LBS TO KGS

        //OPTION 2 KGS TO LBS

        //OPTION 3 NOT A VALID CHOICE
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to weight converter program!");

        //DECLARE VARIABLES
        double weight;
        double newWeight;
        int choice;

        System.out.println("choice 1 :lbs to kgs");
        System.out.println("choice 2 :kgs to lbs");




        System.out.println("Enter your choice :");
        choice=sc.nextInt();

        if(choice==1){
            System.out.println("Enter weight");
            weight=sc.nextDouble();
            newWeight=weight*0.453592;
            System.out.printf("NewWeight in kgs %.2f\n",newWeight);


        } else if (choice==2) {
            System.out.println("Enter weight");
            weight=sc.nextDouble();
            newWeight=weight*2.0462;
            System.out.printf("NewWeight in lbs %.2f\n",newWeight);

        }else{
            System.out.println("Invalid choice");
        }


    }
}
