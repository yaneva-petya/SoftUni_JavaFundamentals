package Regex.Lecture;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();
        Pattern pattern=Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher=pattern.matcher(input);

        while (matcher.find()){
            String currentName=matcher.group()+" ";
            System.out.print(currentName);
        }

    }
}
