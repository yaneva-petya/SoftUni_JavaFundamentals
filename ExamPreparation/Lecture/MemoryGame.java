package ExamPreparation.Lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> num= Arrays.stream(s.nextLine().split(" "))
                .collect(Collectors.toList());

        String integers=s.nextLine();
        int moves=0;

        while(!integers.equals("end") ){

            String[] index=integers.split(" ");
            int index1=Integer.parseInt(index[0]);
            int index2=Integer.parseInt(index[1]);


            moves++;

            boolean areValid=index1>=0 && index1<=num.size()-1 &&
                    index2>=0 && index2<=num.size()-1;

            if(index1==index2 || !areValid){
                 String elementToAdd="-"+moves+"a";
                int middle=num.size()/2;
                num.add(middle,elementToAdd);
                num.add(middle, elementToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");
                integers=s.nextLine();
                continue;
            }
            String firstElement = num.get(index1);
            String secondElement = num.get(index2);
            if(firstElement.equals(secondElement)){

                num.remove(firstElement);
                num.remove(secondElement);
                System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);
                }
            else{
                System.out.println("Try again!");
            }




            if(num.isEmpty()){
                System.out.printf("You have won in %d turns!%n", moves);
                return;
            }

               integers=s.nextLine();

        }

        if(!num.isEmpty()){
            System.out.println("Sorry you lose :(");
            System.out.print(String.join(" ", num));
        }

    }
}
