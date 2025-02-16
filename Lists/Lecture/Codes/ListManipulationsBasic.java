package Lists.Lecture.Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsBasic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //прочитаме списък с цели числа;
        List<Integer> numbers= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

       String command=s.nextLine();
       while(!command.equals("end")){

           manipulation(command, numbers);
           command=s.nextLine();
       }

       for(int num:numbers){
           System.out.printf("%d ", num);
       }
    }

    public static List<Integer> manipulation(String command, List<Integer> numbers){
        String[] commandParts=command.split(" ");
        String commandName=commandParts[0];//"Add", "Remove", "RemoveAt", "Insert";

        switch (commandName){
            case "Add":
                int numToAdd=Integer.parseInt(commandParts[1]);
                numbers.add(numToAdd);
                break;
            case "Remove":
                int numToRemove=Integer.parseInt(commandParts[1]);
                numbers.remove(Integer.valueOf(numToRemove));
                break;
            case "RemoveAt":
                int numRemoveAt=Integer.parseInt(commandParts[1]);
                numbers.remove(numRemoveAt);
                break;
            case "Insert":
                int numForInsert=Integer.parseInt(commandParts[1]);
                int indexForInsert=Integer.parseInt(commandParts[2]);
                numbers.add(indexForInsert,numForInsert);
                break;
        }
        return numbers;
    }
}
