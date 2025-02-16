package TextProcessing.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String text=s.nextLine();
        StringBuilder sb=new StringBuilder(text);
        for(int i=0;i<sb.length()-1;i++){
              if(sb.charAt(i)==sb.charAt(i+1)){
                sb.deleteCharAt(i+1);
                i--;
              }
        }

        System.out.println(sb);
    }
}
