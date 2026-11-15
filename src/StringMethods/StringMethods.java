package StringMethods;

import java.awt.desktop.SystemSleepEvent;
import java.io.FilterOutputStream;

public class StringMethods {
    public static void main(String[] args){
        String name="Nidhi reddy";

        //length()-Returns the length of the String
        int length=name.length();
        System.out.println(length);

        //Returns the char value at the specified index. An index ranges from 0 to length() - 1.
        char letter=name.charAt(3);
        System.out.println(letter);

        //Returns the index within this string of the first occurrence of the specified substring.
        int index1=name.indexOf("i");
        int index2=name.indexOf(" ");
        System.out.println(index2);

        //Returns the index within this string of the last occurrence of the specified substring.
        int lastIndex=name.lastIndexOf("e");
        System.out.println(lastIndex);

        //he String, converted to uppercase.
        String newName1=name.toUpperCase();
        System.out.println(newName1);

        //the String, converted to lowercase.
        String newName2=name.toLowerCase();
        System.out.println(newName2);

        //trim() remove white spaces
        String n="     helo Bangalore    ";
        String n1=n.trim();
        System.out.println(n1);

        //replace()
        String city="Hyderabad";
        String newCity=city.replace("d","z");
        System.out.println(newCity);

        //isEmpty()
        String studentName="";

        System.out.println(studentName.isEmpty());
        /*

        if(studentName.isEmpty()){
            System.out.println("you are name can't be empty");
        }else {
            System.out.println(studentName);
        }



      if(studentName.contains(" ")){
          System.out.println("yor name contains space");
      }else{
          System.out.println("there is no space in your name");
      }

         */
        String userName="12374";
        if(userName.equals("1234")){
            System.out.println("valid username");
        }else {
            System.out.println("Invalid username");
        }

    }
}
