package MidExam.New;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command=s.nextLine();
        while(!command.equals("END")){
            String[] parts=command.split(" ");
            modifier(numbers, parts);
            command=s.nextLine();
        }

        for(int n:numbers){
            System.out.print(n+" ");
        }
    }

    public static void modifier(List<Integer> num, String[] command){
        String name=command[0];
        switch (name){
            case "Change"->change(num,command);
            case "Hide"->hide(num, command);
            case "Switch"->switchMethod(num, command);
            case "Insert"->insert(num, command);
            case "Reverse"-> Collections.reverse(num);
        }
    }

    public static void change(List<Integer> num, String[] command){
        int paintingNum=Integer.parseInt(command[1]);
        int newNumber=Integer.parseInt(command[2]);

        if(num.contains(paintingNum)){
            int index=num.indexOf(paintingNum);
            num.set(index,newNumber);
        }
    }
    public static void hide(List<Integer> num, String[] command){
        int numberToHide=Integer.parseInt(command[1]);
        if(num.contains(numberToHide)){
            num.remove(Integer.valueOf(numberToHide));
        }
    }

    public static void switchMethod(List<Integer> num, String[] command){
        int firstNum=Integer.parseInt(command[1]);
        int secondNum=Integer.parseInt(command[2]);

        if(num.contains(firstNum) && num.contains(secondNum)){
            int index1=num.indexOf(firstNum);
            int index2=num.indexOf(secondNum);

            num.set(index1, secondNum);
            num.set(index2,firstNum);
        }
    }
    public static void insert(List<Integer> num, String[] command){
        int index=Integer.parseInt(command[1]);
        int number=Integer.parseInt(command[2]);

        if(index>=0 && index<=num.size()){
            num.add(index+1, number);
        }
    }

}
