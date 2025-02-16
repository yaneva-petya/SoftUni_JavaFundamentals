package ClassesAndObjects.Lecture.Students;


public class Student {
    private String firstName;
    private String lastName;
    private  int age;
    private String hometown;

    public Student(){
        String firstName=" ";
        String lastName=" ";
        int age=0;
        String hometown=" ";
    }

    public Student(String firstName, String lastName, int age, String hometown){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHomeTown(hometown);
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String name){
        this.firstName=name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName ){
        this.lastName=lastName;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getHometown(){
        return hometown;
    }
    public void setHomeTown(String hometown){
        this.hometown=hometown;
    }

    //testing something
    /*public void sayHello(){
        System.out.printf("Hello, %s %s!%n", this.firstName, this.lastName);
    }
    public static void sayAge(int age){
        System.out.printf("You are %d years old!%n", age);
    }*/

}
