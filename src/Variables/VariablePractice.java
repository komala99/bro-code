package Variables;

public class VariablePractice {
    public static void main(String[] args) {
        //variable is a named container for a value
        //primitive =simple value stored directly in stack
        //Reference =memory address that points to the heap
        // Primitive        Reference
        //int                String
        //double             array
        //boolean            objects
        //char

        //steps for creating a variable
        //1 .declaration
        //2 .Assignment

        //we use camelCase for variable names in java

        //Syntax
        //datatype variablename=value;

        //int for whole numbers
        int age;//declaration
        age = 23; //Assignment

        //double and float for decimal numbers
        double cgpa=9.9;
        float height=5.9f;
        //declaration and assignment in one line

        //char for to store single character
        char grade='A';
        char symbol='!';
        char currency='$';

         //boolean has two possible outcomes either true or false
        boolean isStudent=true;
        boolean isOnline=false;
        boolean forSale=true;

        //String stores the group of characters
        String name="Nirup";
        String food="Masala Dosa";
        String email="lopi@gmail.com";


        System.out.println("My name is "+name);
        System.out.println("I am "+age+ " old.");
        System.out.println("My cgpa is "+cgpa);
        System.out.println("My height "+height);//we can also print variable with text called string concatenation
        System.out.println("Student grade is "+grade+"." );


        System.out.println("I like "+food);
        System.out.println("My professional email is "+email);
        System.out.println(symbol);
        System.out.println(currency);
        System.out.println(isStudent);
        System.out.println(isOnline);
        System.out.println(forSale);



    }
}
