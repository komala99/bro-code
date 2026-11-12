package ArithmeticOperators;

public class ArithmeticOperatorsPractice {
    public static void main(String[] args){
        //Arithmetic Operators used to perform arithmetic operations in java
        //+ - * / %
        //Augmented assignment operators
        //+= -= *= /= %=



        int x=10;
        int y=2;

        int addition=x+y;
        int subtraction=x-y;
        int multiply=x*y;
        int division=x/y;
        int remainder=x%y;

        //instead of these creating  new variable to store results lets use augmented Operators
        //example we need add x and y and we need to store result in x
        x +=y; //x=x+y; both same
        //x -=y;
        //x *=y;
        //x /=y; //when performing integer division use double datatype to store result
        //x %=y;
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiply);
        System.out.println(division);
        System.out.println(remainder);

        System.out.println(x);

        //Increment operators
        //post increment ->i++
        //use old value first then update
        //pre increment ->++i
        //first increment and then use the value

        int a=9;
        int b=5;
        System.out.println(a++);
        //it prints 9  and  then update 10

        System.out.println(++b);
        //first update 6 and then prints 6


        //Decrement operators
        //post Decrement ->i--
        //use old value first then Decrement
        //pre Decrement ->--i
        //first Decrement and then use the value

        System.out.println(a--);
        System.out.println(--b);




    }
}
