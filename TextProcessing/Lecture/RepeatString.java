package TextProcessing.Lecture;

import java.util.*;

public class RepeatString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] words=s.nextLine().split("\\s+");

        String resultText="";
        for(String word: words){
            int countWord=word.length();
            for(int i=1;i<=countWord;i++){
                resultText+=word;
            }

        }
        System.out.println(resultText);
    }
}
