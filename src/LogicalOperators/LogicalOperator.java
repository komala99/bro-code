package LogicalOperators;

public class LogicalOperator {
    public static void main(String[] args){
        //logical AND->&&[both condition must be true]

        //logical OR ->||[one condition must be true]
        //logical NOT ->![reverse of the boolean value]

        double temp=25;
        boolean isSunny=true;

        if(temp<=30 && temp>=0 && isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside ");
        } else if (temp<=30 && temp>=0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside ");
        } else if (temp<0 || temp>30) {
            System.out.println("The weather is bad");
        }
    }
}
