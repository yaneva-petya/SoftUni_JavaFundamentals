package FinalExam;

import java.util.*;

public class Problem_01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        StringBuilder password = new StringBuilder(s.nextLine());

        String command = s.nextLine();
        while (!command.equals("Complete")) {
            String[] data = command.split("\\s+");

            String commandName = data[0];

            switch (commandName) {
                case "Make" -> {
                    if (data[1].equals("Upper")) {
                        int index = Integer.parseInt(data[2]);
                        char letter = Character.toUpperCase(password.charAt(index));
                        password.deleteCharAt(index);
                        password.insert(index, letter);
                        System.out.println(password);
                    } else {
                        int index = Integer.parseInt(data[2]);
                        char letter = Character.toLowerCase(password.charAt(index));
                        password.deleteCharAt(index);
                        password.insert(index, letter);
                        System.out.println(password);
                    }
                }
                case "Insert" -> {
                    int index = Integer.parseInt(data[1]);
                   char character=data[2].charAt(0);
                    boolean isValid = indexValidation(index, password) ;
                    if(isValid){
                        password.insert(index, character);
                        System.out.println(password);
                    }


                    }
                    case "Replace" -> {
                        String character=data[1];
                        int value=Integer.parseInt(data[2]);
                        int asciiValue=(int)character.charAt(0);
                        int newAsciiValue=asciiValue+value;
                        char newChar=(char)newAsciiValue;
                        for (int i = 0; i < password.length(); i++) {
                            if (password.charAt(i) == character.charAt(0)) {
                                password.setCharAt(i, newChar);
                            }
                        }
                        System.out.println(password);
                    }
                    case "Validator" -> {

                        if (password.toString().length() < 8) {
                            System.out.println("Password must be at least 8 characters long!");
                        } else if (!password.toString().matches("[A-Za-z0-9_]+")) {
                            System.out.println("Password must consist only of letters, digits and _!");
                        } else if (!password.toString().matches(".*[A-Z].*")) {
                            System.out.println("Password must consist at least one uppercase letter!");
                        } else if (!password.toString().matches(".*[a-z].*")) {
                            System.out.println("Password must consist at least one lowercase letter!");
                        } else if (!password.toString().matches(".*\\d.*")) {
                            System.out.println("Password must consist at least one digit!");
                        }


                    }
                }


                command = s.nextLine();
            }
        }
        public static boolean indexValidation(int index, StringBuilder password){
        if(index>=password.length() || index<0){
            return false;
        }
        return true;
        }


    }
