package Break;

public class BreakPractice {
    public static void main(String[] args){
        //break =exit loop[
        //continue=skip current iteration

        for(int i=1;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        for(int i=1;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
