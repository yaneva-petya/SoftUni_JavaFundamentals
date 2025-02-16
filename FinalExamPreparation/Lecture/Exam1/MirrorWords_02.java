package FinalExamPreparation.Lecture.Exam1;


import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String text = s.nextLine();
        String regex = "([@#])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1"; // Corrected regex
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> reversedWordList = new ArrayList<>();
        int pairs = 0;

        while (matcher.find()) {
            pairs++;
            StringBuilder first = new StringBuilder(matcher.group("firstWord"));
            StringBuilder second = new StringBuilder(matcher.group("secondWord"));

            if (first.toString().equals(second.reverse().toString())) {
                reversedWordList.add(first.toString() + " <=> " + second.reverse().toString());
            }
        }

        if (pairs > 0) {
            System.out.printf("%d word pairs found!\n", pairs);
            if (reversedWordList.isEmpty()) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are:" );
                System.out.println(String.join(", ", reversedWordList));
            }
        } else {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
    }
}
