package Regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();

        Pattern pattern=Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]+)\\$");
double totalSum=0.0;

        while(!input.equals("end of shift")){

            Matcher matcher= pattern.matcher(input);
            if(matcher.find()){
                String name= matcher.group("name");
                String product=matcher.group("product");
                int quantity=Integer.parseInt(matcher.group("quantity"));
                double price=Double.parseDouble(matcher.group("price"));

                double currentSum=quantity*price;
                totalSum+=currentSum;
                System.out.printf("%s: %s - %.2f%n", name, product, currentSum);
            }
            input=s.nextLine();

        }

        System.out.printf("Total income: %.2f%n", totalSum);
    }
}
