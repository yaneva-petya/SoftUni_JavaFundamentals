package ClassesAndObjects.Exercises.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Student> studentList=new ArrayList<>();
        int n=Integer.parseInt(s.nextLine());
        for(int i=1;i<=n;i++){
            String input=s.nextLine();
            String[] parts=input.split(" ");
            String firstName=parts[0];
            String lastName=parts[1];
            double grade=Double.parseDouble(parts[2]);

            Student student=new Student(firstName,lastName,grade);
            studentList.add(student);
        }
        studentList.sort((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()));

        for(Student student:studentList){
           System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
