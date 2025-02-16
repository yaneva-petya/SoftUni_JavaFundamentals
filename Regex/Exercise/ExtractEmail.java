package Regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();

        //{user}@{host} -> valid email

        String regexUser="[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+";
        String regexHost="[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z]*)+";
        String regexEmail=regexUser+ "@"+regexHost;//valid email

        Pattern pattern=Pattern.compile(regexEmail);
        Matcher matcher=pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
