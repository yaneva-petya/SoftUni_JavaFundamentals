package Regex.Exercise;

import java.util.ArrayList;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String input=s.nextLine();

        double sum=0;
        Pattern pattern=Pattern.compile(">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)");
        System.out.println("Bought furniture:");
        while(!input.equals("Purchase")){
            Matcher matcher=pattern.matcher(input);
            if(matcher.find())
            {
                String name=matcher.group("furnitureName");
                double price=Double.parseDouble(matcher.group("price"));
                int quantity=Integer.parseInt(matcher.group("quantity"));
                System.out.println(name);
                sum+=price*quantity;
            }

            input=s.nextLine();
        }
        System.out.printf("Total money spend: %.2f%n", sum);
    }
}
