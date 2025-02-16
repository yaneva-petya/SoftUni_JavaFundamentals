package AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       String input=s.nextLine();
        Map<Character,Integer> textInput=new LinkedHashMap<>() ;

       for(char symbol:input.toCharArray()){
           if(symbol==' '){
               continue;
           }
           if(!textInput.containsKey(symbol)){
               textInput.put(symbol,1);
           }
           else{
               textInput.put(symbol, textInput.get(symbol)+1);
           }
       }

       for(Map.Entry<Character, Integer> entry: textInput.entrySet()){
           System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
       }
    }
}
