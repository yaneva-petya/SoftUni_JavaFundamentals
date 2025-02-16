package FinalExam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        String regex = "^([%$])([A-Z][a-z]+)\\1: \\[\\d+\\]\\|\\[\\d+\\]\\|\\[\\d+\\]\\|$";

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();


            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {

                String tag = matcher.group(2);
                String numbersPart = input.split(": ")[1]; // Everything after ": "
                String[] numbers = numbersPart.split("\\|");

                // Decrypt the message
                StringBuilder decryptedMessage = new StringBuilder();
                for (String numStr : numbers) {
                    numStr = numStr.replaceAll("[\\[\\]]", ""); // Remove brackets
                    int num = Integer.parseInt(numStr);
                    decryptedMessage.append((char) num);
                }


                System.out.println(tag + ": " + decryptedMessage);
            } else {
                System.out.println("Valid message not found!");
            }
        }

        scanner.close();
    }
}
