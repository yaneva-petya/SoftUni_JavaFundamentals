package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Map<String, Integer> task=new LinkedHashMap<>();
        String input=s.nextLine();
        int i=1;
        String resource="";
        int quantity=0;
        while (!input.equals("stop")){

            if(i%2!=0){
                resource=input;

            }
            else{
                quantity=Integer.parseInt(input);
            }

            if(!task.containsKey(resource)){
                task.put(resource,0);
            }else{
                task.put(resource, task.get(resource)+quantity);
            }


            i++;
            quantity=0;
            input=s.nextLine();
        }

        for(Map.Entry<String, Integer> entry: task.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
