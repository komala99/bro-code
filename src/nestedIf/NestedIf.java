package nestedIf;

public class NestedIf {
    public static void main(String[] args){
        //nested if statement =if-statement inside if-statement.
        boolean isStudent=false;
        boolean isSenior=true;
        double price=9.98;

        if(isStudent){
            if(isSenior){
                System.out.println("Yoy get a student discount 10%");
                System.out.println("Yoy get a senior discount 20%");
                price*=0.3;
            }else{
                System.out.println("Yoy get a student discount 10%");
                price*=0.9;
            }
        }else{
            if(isSenior) {
                System.out.println("Yoy get a senior discount 20%");
                price *= 0.8;
            }else{
                price*=1;
            }
        }
        System.out.println("Final price is :"+price);

    }
}
