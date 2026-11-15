package EnhancedSwitch;

public class SwitchStatement {
    public static void main(String[] args){
        //Enhanced Switch= A replacement to many else-if statements
        //java 14 feature

        String day="thursday";
        String result=day.substring(0,1).toUpperCase()+day.substring(1,day.length());
        //System.out.println(result);
        /*

        if(day.equals("Monday")){
            System.out.println("Monday");
        } else if (day.equals("Tuesday")) {
            System.out.println("Tuesday");
        }else if (day.equals("Wednesday")) {
            System.out.println("Wednesday");
        }else if (day.equals("Thursday")) {
            System.out.println("Thursday");
        }else if (day.equals("Friday")) {
            System.out.println("Friday");
        }else if (day.equals("Saturday")) {
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid day");
        }

         */
        switch (result){
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
}
