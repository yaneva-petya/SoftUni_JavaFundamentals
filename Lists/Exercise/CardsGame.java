package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> first= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> second= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

       while(!first.isEmpty() && !second.isEmpty()){
           int firstCard=first.get(0);
           int secondCard=second.get(0);

           if(firstCard>secondCard){
               first.remove(0);
               second.remove(0);

               first.add(firstCard);
               first.add(secondCard);
           }
           else if(secondCard>firstCard){
               first.remove(0);
               second.remove(0);

               second.add(secondCard);
               second.add(firstCard);
           }
           else{
               first.remove(0);
               second.remove(0);
           }
       }


       if(!first.isEmpty()){
           int sumOfFirst=first.stream().mapToInt(Integer::intValue).sum();
       System.out.printf("First player wins! Sum: %d%n", sumOfFirst);
       }
       else{
          int sumOfSecond=second.stream().mapToInt(Integer::intValue).sum();
      System.out.printf("Second player wins! Sum: %d%n", sumOfSecond);
       }

    }
}
