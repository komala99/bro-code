package printf;

public class Practice1 {
    public static void main(String[] args){
        //printf() =is used to format output
        //%[flags][width][.precision][specifier-character]

        String name="Nimutha";
        char firstLetter='N';
        int age=23;
        double height=5.9;
        boolean isEmployee=true;

       // [specifier-character]
        //int->%d
        //String->%s
        //char->%c
        //double or float->%f
        //boolean->%b
        System.out.printf("my name is %s\n",name);
        System.out.printf("my firstLetter is %c\n",firstLetter);
        System.out.printf("I am %d old \n",age);
        System.out.printf("My height %f\n",height);
        System.out.printf("isEmployee %b\n",isEmployee);

        //[.precision]=we can limit the number of precision after decimal point
        //
        double number1=89.652334;
        double number2=4.5768;
        double number3=45.326;
        System.out.printf("%.1f\n",number1);//one digit after the decimal
        System.out.printf("%.2f\n",number2);//two digit after the decimal
        System.out.printf("%.3f\n",number3);//three digit after the decimal


        //[flags]
        //+ =output a plus
        // ,=comma grouping separator
        //( =negative are enclosed with in ()
        //space =display a minus if negative,space if positive
        double num=7.78654;
        double num2=-34.7;

        System.out.printf("%+.2f\n",num);
        System.out.printf("%,.2f\n",num);
        System.out.printf("%(.1f\n",num2);
        System.out.printf("% .1f\n",num);

        //[width]
        //0 = zero padding
        //number = right justified padding
        //negative number =left justified padding

        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7896;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);



    }
}
