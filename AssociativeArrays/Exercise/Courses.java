package AssociativeArrays.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();
        Map<String, List<String>> courses=new LinkedHashMap<>();

        while(!input.equals("end")){
            String[] commands=input.split("\\:");
            String nameCourse=commands[0];
            String nameStudent=commands[1];

            courses.putIfAbsent(nameCourse,new ArrayList<>());
            courses.get(nameCourse).add(nameStudent);

            input=s.nextLine();
        }

        for(String nameCourse: courses.keySet()){
           List<String> student=courses.get(nameCourse);

           System.out.printf("%s: %d\n", nameCourse, student.size());
           for(String st:student){
           System.out.printf("-- %s\n", st);}
        }

    }
}
