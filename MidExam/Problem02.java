package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<Integer> number= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command=s.nextLine();

        while(!command.equals("Finish")){

            String[] parts=command.split(" ");
            modifier(number, parts);

            command=s.nextLine();
        }

        for(int n:number){
            System.out.print(n+" ");
        }
    }
    public static void modifier(List<Integer> num, String[] command){
        String nameCommand=command[0];

        switch (nameCommand){
            case "Add"->add(num, command);
            case "Remove"->remove(num,command);
            case "Replace"->replacement(num, command);
            case "Collapse"->collapse(num,command);

        }


    }
    public static void add(List<Integer> num, String[] command){
        int numberToAdd=Integer.parseInt(command[1]);
        num.add(numberToAdd);
    }


    public static void remove(List<Integer> num, String[] command){
        int numberToRemove=Integer.parseInt(command[1]);

        if(num.contains(numberToRemove)){
            num.remove((Integer) numberToRemove);
        }
    }

    public static void replacement(List<Integer> num, String[] command){
        int value=Integer.parseInt(command[1]);
        int replacement=Integer.parseInt(command[2]);

        if(num.contains(value)){
            int indexOfValue=num.indexOf(value);
            num.set(indexOfValue, replacement);
        }
    }

    public static void collapse(List<Integer> num, String[] command){
        int number=Integer.parseInt(command[1]);

        for (int i = num.size() - 1; i >= 0; i--) {
            if (num.get(i) < number) {
                num.remove(i);
            }
        }
    }
}
