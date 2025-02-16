package Lists.Lecture.Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int iterations=numbers.size()/2;

        for(int i=0;i<iterations;i++){
            numbers.set(i, numbers.get(i)+numbers.get(numbers.size()-1));
            numbers.remove(numbers.size()-1);
        }

        for(int n:numbers){
            System.out.print(n+" ");
        }
    }
}
