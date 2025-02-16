package Lists.Lecture.Demo;

import java.util.*;
import java.util.concurrent.Callable;

public class DemoSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers=new ArrayList<>(Arrays.asList(4,12,3,9,34,23,7,56));

        //ascending order -> от най-малкото към най-голямото
        Collections.sort(numbers);

        for (int i:numbers){
            System.out.print(i+" ");
        }
System.out.println();
        //descending order -> от най-голямото към най-малкото;
        Collections.sort(numbers);
        Collections.reverse(numbers);

        for(int n:numbers){
            System.out.print(n+" ");
        }
    }
}
