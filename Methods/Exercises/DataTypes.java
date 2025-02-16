package Methods.Exercises;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String dataType=s.nextLine();
        type(dataType,s);

    }

    public static void type(String type, Scanner s){

        switch (type) {
            case "int": {
                int number = Integer.parseInt(s.nextLine());
                System.out.println(number * 2);
                break;
            }
            case "real":{
                double number = Double.parseDouble(s.nextLine());
                System.out.printf("%.2f%n", number *1.5);
                break;
            }
            case "string": {
                String input = s.nextLine();
                System.out.print("$"+input+"$");
                break;

            }
        }
    }
}

