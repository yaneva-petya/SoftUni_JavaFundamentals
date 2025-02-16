package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = s.nextLine();

        while (!command.equals("END")) {
            String[] parts = command.split(" ");
            modifier(numbers, parts);
            command = s.nextLine();
        }


        System.out.println(numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
    }

    public static void modifier(List<Integer> num, String[] parts) {
        String name = parts[0];
        switch (name) {
            case "add" -> addToStart(num, parts);
            case "remove" -> {
                if (parts[1].equals("greater")) {
                    removeGreaterThan(num, parts);
                } else if (parts[1].equals("at")) {
                    removeAtIndex(num, parts);
                }
            }
            case "replace" -> replace(num, parts);
            case "find" -> {
                if (parts[1].equals("even")) {
                    findEven(num);
                } else {
                    findOdd(num);
                }
            }
        }
    }

    public static void addToStart(List<Integer> num, String[] parts) {
        for (int i=parts.length-1;i>=3;i--){
            int numberToAdd=Integer.parseInt(parts[i]);
            num.add(0,numberToAdd);
        }
    }

    public static void removeGreaterThan(List<Integer> num, String[] parts) {
        int value = Integer.parseInt(parts[3]);
        num.removeIf(n -> n > value);
    }

    public static void replace(List<Integer> num, String[] parts) {
        int value = Integer.parseInt(parts[1]);
        int replacement = Integer.parseInt(parts[2]);

        int index = num.indexOf(value);
        if (index != -1) {
            num.set(index, replacement);
        }
    }

    public static void removeAtIndex(List<Integer> num, String[] parts) {
        int index = Integer.parseInt(parts[3]);
        if (index >= 0 && index < num.size()) {
            num.remove(index);
        }
    }

    public static void findEven(List<Integer> num){
        for(int i=0;i<num.size();i++){
            int number=num.get(i);
            if(number%2==0){
                System.out.print(number+" ");
            }
        }
        System.out.println();
    }

    public static void findOdd(List<Integer> num){
        for(int i=0;i<num.size();i++){
            int number=num.get(i);
            if(number%2!=0){
                System.out.print(number+" ");
            }
        }
        System.out.println();
    }
}
