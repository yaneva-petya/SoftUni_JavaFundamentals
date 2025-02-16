package ClassesAndObjects.Exercises.OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Student> studentList=new ArrayList<>();

        String input=s.nextLine();
        while(!input.equals("End")){
            String[] parts=input.split(" ");
            String name=parts[0];
            String ID=parts[1];
            int age=Integer.parseInt(parts[2]);

            Student student=new Student(name,ID, age);
            studentList.add(student);
            input=s.nextLine();
        }


        studentList.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));


        for(Student st:studentList){
            System.out.printf("%s with ID: %s is %d years old.%n", st.getName(), st.getID(), st.getAge());
        }

    }
}
