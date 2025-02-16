package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> input= Arrays.stream(s.nextLine().split(" "))
                .collect(Collectors.toList());

        String command=s.nextLine();

        while(!command.equals("3:1")){
            String[] parts=command.split(" ");
            String commandName=parts[0];

               switch (commandName){
                   case "merge"->mergeMethod(input,parts);
                   case "divide"->divideMethod(input, parts);
               }

            command=s.nextLine();
        }
    for(String str:input){
    System.out.print(str+" ");}
    }

    public static void mergeMethod(List<String> input, String[] parts){
        int startIndex=Integer.parseInt(parts[1]);
        int endIndex=Integer.parseInt(parts[2]);

        if(startIndex<0){
            startIndex=0;
        }
        if(endIndex>=input.size()-1){
            endIndex=input.size();
        }


        if(startIndex > 0 && startIndex < input.size() && endIndex >= startIndex && endIndex < input.size()){
            String mergedElement=input.get(startIndex);

            for(int i=startIndex+1;i<=endIndex;i++){
                mergedElement+=input.get(i);

            }

            for(int j=endIndex;j>startIndex;j--){
                input.remove(j);
            }

            input.set(startIndex, mergedElement);
        }
    }

    public static void divideMethod(List<String> input, String[] parts){
        int index=Integer.parseInt(parts[1]);
        int partitions=Integer.parseInt(parts[2]);

        //Взимаме елемента, който ще делим
        String element=input.get(index);
        int elementLength=element.length();

       List<String> newParts=new ArrayList<>();

       int partSize=elementLength/partitions;//when dividing element equally;
        int remainder=elementLength%partitions;//remainder will hold haw many extra characters we have; 7%3=1 extra character;

        int start=0;
        for(int i=0;i<partitions;i++){
            int end=start+partSize;
            if(i<remainder){
                end++;
            }

            newParts.add(element.substring(start,end));
            start=end;
        }

        input.remove(element);
        input.addAll(newParts);


    }
}
