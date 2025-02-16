package Methods.Exercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input=s.nextLine();
        System.out.println(middleChars(input));

    }

    public static String middleChars(String input){

        String middle="";
        if((input.length())%2!=0){
            int index=input.length()/2;
            middle+=input.charAt(index);
        }
        else{
           int firstIndex=(input.length()/2)-1;
           int secondIndex=input.length()/2;
           middle+=input.charAt(firstIndex);
        middle+=input.charAt(secondIndex);
        }

        return middle;
    }
}
