package FinalExamPreparation.Lecture.Exam2;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        StringBuilder input=new StringBuilder(s.nextLine());
        String command=s.nextLine();

        while(!command.equals("Travel")){
            String[] data=command.split("\\:");
            String currentCommand=data[0];

            switch (currentCommand){
                case "Add Stop"->{
                    int index=Integer.parseInt(data[1]);
                    String string=data[2];
                    boolean isValid=validIndex(index, input);
                    if(isValid){
                        input.insert(index, string);
                    }
                    System.out.println(input);
                }
                case "Remove Stop"->{
                    int startIndex=Integer.parseInt(data[1]);
                    int endIndex=Integer.parseInt(data[2]);
                    boolean isValidStartIndex=validIndex(startIndex, input);
                    boolean isValidEndIndex=validIndex(endIndex,input);
                    if(isValidStartIndex && isValidEndIndex){
                        input.delete(startIndex,endIndex+1);
                    }
                    System.out.println(input);
                }
                case "Switch"->{
                    String oldString=data[1];
                    String newString=data[2];

                    if(input.toString().contains(oldString)){
                        int startIndex= input.indexOf(oldString);
                        int lastIndex=startIndex+oldString.length();
                        input.replace(startIndex, lastIndex,newString );
                    }

                    System.out.println(input);
                }
            }


            command=s.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", input);
    }

    public static boolean validIndex(int index, StringBuilder input){
        if(index>=input.length() || index<0){
            return false;
        }
        return true;
    }
}
