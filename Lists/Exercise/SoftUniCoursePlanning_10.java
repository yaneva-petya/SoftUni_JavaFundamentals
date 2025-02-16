package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> schedule= Arrays.stream(s.nextLine().split("\\, "))
                .collect(Collectors.toList());

        /*for(String str:schedule){
            System.out.print(str+" ");
        }*/

        String command=s.nextLine();
        while(!command.equals("course start")){
            String[] parts=command.split("\\:");
            modifier(schedule,parts);
            command=s.nextLine();
        }

        int i=1;
        for(String str:schedule){
            System.out.printf("%d.%s%n", i, str);
            i++;
        }
    }
    public static void modifier(List<String> schedule, String[] parts){
        String nameCommand=parts[0];

        switch (nameCommand){
            case "Add"->addMethod(schedule,parts);
            case "Insert"->insertMethod(schedule,parts);
            case "Remove"->removeMethod(schedule,parts);
            case "Swap"->swapMethod(schedule,parts);
            case "Exercise"->exerciseMethod(schedule,parts);
        }


    }
    public static void addMethod(List<String> schedule,String[] parts){
        String lessonTitle=parts[1];

        if(!schedule.contains(lessonTitle)){
            schedule.add(lessonTitle);
        }
    }

    public static void insertMethod(List<String> schedule, String[] parts){
        String lessonTitle=parts[1];
        int index=Integer.parseInt(parts[2]);

        if(!schedule.contains(lessonTitle)){
            schedule.add(index, lessonTitle);
        }
    }

    public static void removeMethod(List<String> schedule, String[] parts){
        String lessonTitle=parts[1];

        if(schedule.contains(lessonTitle)){
            schedule.remove(lessonTitle);
            schedule.remove(lessonTitle + "-Exercise");
        }
    }

    public static void swapMethod(List<String> schedule, String[] parts){
        String lessonTitle1=parts[1];
        String lessonTitle2=parts[2];

        if(schedule.contains(lessonTitle1) && schedule.contains(lessonTitle2)){
            int firstIndex=schedule.indexOf(lessonTitle1);
            int secondIndex=schedule.indexOf(lessonTitle2);

            schedule.set(secondIndex,lessonTitle1);
            schedule.set(firstIndex,lessonTitle2);

            if(schedule.contains(lessonTitle1+"-Exercise")){
                schedule.remove(lessonTitle1+"-Exercise");
                schedule.add(secondIndex+1,lessonTitle1+"-Exercise");
            }
            if(schedule.contains(lessonTitle2+"-Exercise")){
                schedule.remove(lessonTitle2+"-Exercise");
                schedule.add(firstIndex+1,lessonTitle2+"-Exercise");
            }
        }

    }

    public static void exerciseMethod(List<String> schedule, String[] parts){
      String lessonTitle=parts[1];
      String newLessonTitle=lessonTitle+"-Exercise";

      if(!schedule.contains(lessonTitle)){
          schedule.add(lessonTitle);
          schedule.add(newLessonTitle);

      }
      else if(!schedule.contains(newLessonTitle)){
          int index=schedule.indexOf(lessonTitle);
          schedule.add(index+1,newLessonTitle);
      }

    }
}
