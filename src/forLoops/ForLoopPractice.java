package forLoops;

public class ForLoopPractice {
    public static void main(String[] args){
        //for loop executes some code a Certain number of times
        //for(initialization;condition;update)
        for(int i=0;i<10;i++){
            //i ,is a loop variable
            System.out.println(i);
        }
        System.out.println();
        for(int i=10;i>0;i--){
            //i ,is a loop variable
            System.out.println(i);
        }
        System.out.println();

        for(int i=0;i<10;i+=2){
            //i ,is a loop variable
            System.out.println(i);
        }
    }
}
