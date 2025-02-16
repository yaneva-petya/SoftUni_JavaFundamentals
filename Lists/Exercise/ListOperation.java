package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = s.nextLine();
        while (!command.equals("End")) {
            operations(numbers, command);
            command = s.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    public static List<Integer> operations(List<Integer> numbers, String command) {
        String[] commands = commandArray(command);
        String operation = commands[0];

        switch (operation) {
            case "Add" -> addMethod(numbers, commands);
            case "Remove" -> removeMethod(numbers, commands);
            case "Insert" -> insertMethod(numbers, commands);
            case "Shift" -> shiftLeftRightMethod(numbers, commands);
        }
        return numbers;
    }

    public static String[] commandArray(String command) {
        return command.split(" ");
    }

    public static void addMethod(List<Integer> numbers, String[] command) {
        numbers.add(Integer.parseInt(command[1]));
    }

    public static void removeMethod(List<Integer> numbers, String[] command) {
        int index = Integer.parseInt(command[1]);
        if (index < 0 || index > numbers.size() - 1) {
            System.out.println("Invalid index");
        } else {
            numbers.remove(index);
        }
    }

    public static void insertMethod(List<Integer> numbers, String[] command) {
        int index = Integer.parseInt(command[2]);
        if (index < 0 || index > numbers.size() - 1) {
            System.out.println("Invalid index");
        } else {
            numbers.add(index, Integer.parseInt(command[1]));
        }
    }

    public static void shiftLeftRightMethod(List<Integer> numbers, String[] command) {
        String typeShift = command[1];
        int count = Integer.parseInt(command[2]);

        switch (typeShift) {
            case "left" -> {
                for (int i = 0; i < count; i++) {
                    int firstElement = numbers.get(0);
                    numbers.add(firstElement);
                    numbers.remove(0);
                }
            }
            case "right" -> {
                for (int i = 0; i < count; i++) {
                    int lastElement = numbers.get(numbers.size() - 1);
                    numbers.add(0, lastElement);
                    numbers.remove(numbers.size() - 1);
                }
            }
        }
    }
}
