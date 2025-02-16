package TextProcessing.Exercise;

import java.util.*;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       StringBuilder input=new StringBuilder(s.nextLine());

       int totalStrength=0;

       for(int positions=0;positions<input.length();positions++){
           char currentSymbol=input.charAt(positions);

           if(currentSymbol=='>'){
               int strengthExplosion=Integer.parseInt(input.charAt(positions+1)+"");
               totalStrength+=strengthExplosion;
           } else if (totalStrength>0) {
               input.deleteCharAt(positions);
              // System.out.println(input);
               totalStrength--;
               positions--;
           }
       }
System.out.println(input);


    }
}
