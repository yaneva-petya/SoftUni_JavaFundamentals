package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> input= Arrays.stream(s.nextLine().split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(input);

        System.out.println(input.toString()
                .replace("[", "")
                .replace("]", "")
                .replaceAll(",", "")
                .replaceAll("\\s+", " ")
                .trim());
    }
}
