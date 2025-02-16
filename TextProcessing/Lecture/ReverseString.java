package TextProcessing.Lecture;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();

        while(!input.equals("end")){
            String reversed="";
            for(int i=input.length()-1;i>=0;i--){
                reversed+=input.charAt(i);
            }

            System.out.printf("%s = %s%n", input, reversed);
            input=s.nextLine();
        }
    }
}
