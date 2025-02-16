package ClassesAndObjects.Lecture.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //testing something;
        //Student st1=new Student("Ivan", "Ivanov", 10, "Haskovo");
        //st1.sayHello();
        //Student.sayAge(st1.getAge());

        List<Student> studentList=new ArrayList<>();
        String input=s.nextLine();//information about every student;

        while (!input.equals("end")){
             String[] data=input.split(" ");
             String firstName=data[0];
             String lastName=data[1];
             int age=Integer.parseInt(data[2]);
             String hometown=data[3];

             /*if(IsStudentExisting(studentList, firstName, lastName)){
                Student st=getStudent(studentList,firstName,lastName);

                st.setFirstName(firstName);
                st.setLastName(lastName);
                st.setAge(age);
                st.setHomeTown(hometown);
             }
             else{
                 Student st=new Student(firstName, lastName, age, hometown);
                 studentList.add(st);
             }*/
            Student st=new Student(firstName, lastName, age, hometown);
            studentList.add(st);
            input=s.nextLine();
        }

        String searchedTown=s.nextLine();
        for (Student student:studentList){
            if(student.getHometown().equals(searchedTown)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(),student.getLastName(), student.getAge());
            }
        }
    }
   /* public static boolean IsStudentExisting(List<Student> students, String firstName, String lastName ){
        for(Student st:students){
            if(st.getFirstName().equals(firstName) && st.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }

    public static Student getStudent(List<Student> students, String firstName, String lastName){
        Student existingStudent=null;

        for(Student st:students){
            if(st.getFirstName().equals(firstName) && st.getLastName().equals(lastName)){
                existingStudent=st;
            }
        }
        return existingStudent;
    }*/
}
