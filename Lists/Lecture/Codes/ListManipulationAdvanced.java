package Lists.Lecture.Codes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(s.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = s.nextLine();

        while (!command.equals("end")) {

            advancedManipulation(command, numbers);
            command = s.nextLine();
        }
    }

    public static String[] stringArr(String command){
        String[] commandParts = command.split(" ");
       return commandParts;
    }

    public static void containsCheck(List<Integer> num, String[] commands ){
        if (num.contains(Integer.parseInt(commands[1]))) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEvenOrOdd(List<Integer> num, String[] commands){
        if (commands[1].equals("even")) {
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i) % 2 == 0) {
                    System.out.print(num.get(i) + " ");
                }
            }
            System.out.println();
        } else {

            for (int i = 0; i < num.size(); i++) {
                if (num.get(i) % 2 != 0) {
                    System.out.print(num.get(i) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void getSumMethod(List<Integer> num, String[] commands){
        int sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }
        System.out.printf("%d%n", sum);
    }

    public static void filter(List<Integer> numbers, String[] commands){
        if (commands[1].equals("<")) {

            int numberToCompare = Integer.parseInt(commands[2]);
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) < numberToCompare) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        }
        if (commands[1].equals(">")) {
            int numberToCompare = Integer.parseInt(commands[2]);
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) > numberToCompare) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        }
        if(commands[1].equals("<=")){
            int numberToCompare = Integer.parseInt(commands[2]);
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) <= numberToCompare) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        }
        if(commands[1].equals(">=")){
            int numberToCompare = Integer.parseInt(commands[2]);
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) >= numberToCompare) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        }
    }



    public static void advancedManipulation(String command, List<Integer> numbers) {
        String[] commandParts=stringArr(command);
        String name=commandParts[0];

        switch (name){
            case "Contains"->containsCheck(numbers,commandParts);
            case "Print"->printEvenOrOdd(numbers,commandParts);
            case "Get"->getSumMethod(numbers,commandParts);
            case "Filter"->filter(numbers,commandParts);
        }

    }
}
