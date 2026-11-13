package MathClass;

public class MathClass {
    public static void main(String[] args){
        //Math class
        //math related methods and values

        System.out.println(Math.PI);//PI value
        System.out.println(Math.E);//Exponential



       double result1=Math.pow(2,3);//2 to the power of 3
        System.out.println(result1);
        //absolute value method
        //gives positive number if it is negative
       double result2=Math.abs(-5);
        System.out.println(result2);

        double result3=Math.sqrt(4);
        System.out.println(result3);

        double result4=Math.round(9.467);
        System.out.println(result4);//round the number

        double result5=Math.ceil(9.475);
        System.out.println(result5);

        double result6=Math.floor(6.785);
        System.out.println(result6);

        int max=Math.max(2,9);
        System.out.println(max);
    }
}
