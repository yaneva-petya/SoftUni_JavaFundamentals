package ClassesAndObjects.Exercises.OrderByAge;

public class Student {
    private String name;
    private String ID;
    private int age;

    public Student(){
        String name=" ";
        String ID=" ";
        int age=0;
    }

    public Student (String name, String ID, int age){
        setName(name);
        setID(ID);
        setAge(age);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

      public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
