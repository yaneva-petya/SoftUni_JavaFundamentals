package Regex.Lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();

        Pattern pattern=Pattern.compile("\\+359([ -])2\\1[0-9]{3}\\1[0-9]{4}\\b");
        Matcher matcher=pattern.matcher(input);

        List<String> matchedList=new ArrayList<>();
        while (matcher.find()){
            matchedList.add(matcher.group());
        }
        System.out.println(String.join(", ", matchedList));
    }
}
