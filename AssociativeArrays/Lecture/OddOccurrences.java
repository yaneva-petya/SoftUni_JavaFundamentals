package AssociativeArrays.Lecture;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] input= s.nextLine().split("\\s+");

        Map<String,Integer> counts=new LinkedHashMap<>();

        for(String word:input){
            String wordInLowerCase=word.toLowerCase();
            if(!counts.containsKey(wordInLowerCase)){
                counts.put(wordInLowerCase,1);
            }
            else{
                counts.put(wordInLowerCase, counts.get(wordInLowerCase)+1);
            }
        }

        List<String> oddWords=new ArrayList<>();

        for(Map.Entry<String, Integer> entry:counts.entrySet()){
            if(entry.getValue()%2!=0){
                oddWords.add(entry.getKey());
            }
        }

        System.out.print(String.join(", ", oddWords));
    }
}
