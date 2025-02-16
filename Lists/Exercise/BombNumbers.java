package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] bombs=Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int bomb=bombs[0];
        int power=bombs[1];

        while(numbers.contains(bomb)){
            int indexOfBomb=numbers.indexOf(bomb);

             int start=Math.max(0, indexOfBomb-power);
             int end=Math.min(numbers.size()-1,indexOfBomb+power);

             for(int i=end;i>=start;i--){
                 numbers.remove(i);
             }
        }
        int sum=0;
        for(int i:numbers){
            sum+=i;
        }
        System.out.println(sum);

    }
}
