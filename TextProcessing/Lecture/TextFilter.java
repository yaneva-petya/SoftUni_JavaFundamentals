package TextProcessing.Lecture;

import java.util.*;

public class TextFilter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] badWords=s.nextLine().split(", ");
        String text=s.nextLine();

        for(String badWord:badWords){
            String replacement="";
           for(int count=1;count<=badWord.length();count++){
               replacement+="*";
           }

           text=text.replace(badWord, replacement);
        }

        System.out.println(text);


    }
}
