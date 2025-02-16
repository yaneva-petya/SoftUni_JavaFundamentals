package AssociativeArrays.Lecture;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //nameStudent,grade
        Map<String, Double> students=new TreeMap<>();

        //Adding elements to the map
        students.put("Ivan", 4.55);
        students.put("Ina", 4.56);
        students.put("Stoyan", 5.45);
        //rewriting the element with a new value;
        students.put("Ivan", 5.55);

        //printing the size of the map
        System.out.println(students.size());

        //Removing elements
        students.remove("Ivan");


        //Is the map is empty -> size=0;
        System.out.println(students.isEmpty());

        //Cleaning all elements in the map;
        //students.clear();
        //System.out.println(students.size());

        System.out.println(students.containsKey("Katya"));
        System.out.println(students.containsValue(4.34));
    }
}
