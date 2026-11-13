package ArithmeticOperators;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        //SHOPPING-CART
        //Scanner object
        Scanner sc= new Scanner(System.in);

        String item;
        int price;
        int quantity;
        char currency='$';
        double total;

        System.out.println("Which item would ypu like to buy :");
        item=sc.nextLine();

        System.out.println("Price for each item :");
        price=sc.nextInt();

        System.out.println("how many would you like to buy :");
        quantity=sc.nextInt();

        total=price*quantity;
        System.out.println("you brought "+quantity+" "+item);
        System.out.println("your total "+currency+total);

        sc.close();




    }
}
