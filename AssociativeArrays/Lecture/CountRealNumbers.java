package AssociativeArrays.Lecture;

import java.util.*;

public class  CountRealNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] numbers= Arrays.stream(s.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> map=new TreeMap<>();//do not think about the type of the map in the first lines of the code;

        for(double i:numbers){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
               /*int occurrences=map.get(i);
               occurrences++;
               map.put(i,occurrences);*/
                map.put(i, map.get(i)+1);
            }
        }

        for(Map.Entry<Double, Integer> entry:map.entrySet()){
             System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue() );
        }


    }
}
