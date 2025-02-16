package Lists.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class GhangeList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> num= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command=s.nextLine();

        while(!command.equals("end")){
            num=manipulations(num,command);
            command=s.nextLine();
        }

        for(int n:num){
            System.out.print(n+" ");
        }
    }

    public static List<Integer> manipulations(List<Integer> num, String command){
        String[] commandParts=returnArrOfStrings(command);
        String name=commandParts[0];

        switch (name){
            case "Delete"->deleteMethod(num, commandParts);
            case "Insert"->insertMethod(num, commandParts);
        }
        return num;
    }

    public static String[] returnArrOfStrings(String command){
        String[] arr=command.split(" ");
        return arr;
    }
    public static void deleteMethod(List<Integer> num, String[] commands){

            int numberToDelete=Integer.parseInt(commands[1]);
            for(int i=0;i<num.size();i++){
                if(num.get(i)==numberToDelete){
                    num.remove(i);
                }
            }

    }

    public static void insertMethod(List<Integer> num, String[] command){
            int numberToInsert=Integer.parseInt(command[1]);
            int positionToInsert=Integer.parseInt(command[2]);
            num.add(positionToInsert, numberToInsert);

    }

}
