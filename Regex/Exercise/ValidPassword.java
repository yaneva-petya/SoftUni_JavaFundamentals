package Regex.Exercise;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regex);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count ; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){

                String password = matcher.group("password");


                StringBuilder concatenatedDigits = new StringBuilder();

                for (char symbol : password.toCharArray()){
                    if(Character.isDigit(symbol)){
                        concatenatedDigits.append(symbol);
                    }
                }

                if(concatenatedDigits.isEmpty()){
                    System.out.println("Group: default");
                }else{
                    System.out.println("Group: " + concatenatedDigits);
                }

            }else {
                System.out.println("Invalid pass!");
            }
        }
    }
}