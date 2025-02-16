package ExamPreparation.Lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> shopping= Arrays.stream(s.nextLine().split("\\!")).collect(Collectors.toList());

        String command=s.nextLine();
        while(!command.equals("Go Shopping!")){
            String[] parts=stringToArray(command);
            shopping=modifier(shopping,parts);
            command=s.nextLine();
        }

       System.out.printf(String.join(", ", shopping));
    }

    public static List<String> modifier(List<String> shopping, String[] command){
        String nameOfCommand=command[0];

        switch (nameOfCommand){
            case "Urgent"->urgent(shopping,command);
            case "Unnecessary"->unnecessary(shopping,command);
            case "Correct"->correct(shopping,command);
            case "Rearrange"->rearrange(shopping,command);
        }

        return shopping;
    }
    public static String[] stringToArray(String command){
        String[] arr=command.split(" ");
        return arr;
    }
    public static void urgent(List<String> shopping, String[] command){

        if(!shopping.contains(command[1])){
            shopping.add(0,command[1]);
        }

    }

    public static void unnecessary(List<String> shopping, String[] command){

        if(shopping.contains(command[1])){
            shopping.remove(command[1]);
        }
    }

    public static void correct(List<String> shopping, String[] command){
        String oldItem=command[1];
        String newItem=command[2];

        if(shopping.contains(oldItem)){
            int oldItemIndex=shopping.indexOf(oldItem);
            shopping.set(oldItemIndex,newItem);
        }
    }

    public static void rearrange(List<String> shopping, String[] command){
        if(shopping.contains(command[1])){
            shopping.remove(command[1]);
            shopping.add(command[1]);
        }
    }
}
