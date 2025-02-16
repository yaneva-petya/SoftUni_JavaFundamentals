package AssociativeArrays.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] words= Arrays.stream(s.nextLine().split("\\s+"))
                .filter(word->word.length()%2==0)
                .toArray(String[]::new);

        //System.out.print(String.join("\n", words));
        Arrays.stream(words).forEach(word->System.out.println(word));
    }
}
