package TextProcessing.Lecture;

import java.util.*;

public class Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String removeString = s.nextLine();
       String input=s.nextLine();

       while (input.contains(removeString)){
           input=input.replace(removeString,"");
       }
System.out.println(input);

    }
}
