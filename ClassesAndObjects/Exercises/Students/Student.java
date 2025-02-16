package ClassesAndObjects.Exercises.Students;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(){
        String firstName=" ";
        String lastName=" ";
        int age=0;
    }

    public Student(String firstName, String lastName, double grade){
        setFirstName(firstName);
        setLastName(lastName);
        setGrade(grade);
    }
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
