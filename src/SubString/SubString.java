package SubString;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args){

        //.substring()=A method is used to extract a portion of the string
        //    .substring(start,end)



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Email");
        String email=sc.nextLine();

        if(email.contains("@")) {

            String username = email.substring(0, email.indexOf("p"));
            String domain = email.substring(7, 9);

            System.out.println(username);
            System.out.println(domain);
        }else{
            System.out.println("email must be contain @ symbol");
        }



    }
}
