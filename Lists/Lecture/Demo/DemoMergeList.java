package Lists.Lecture.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DemoMergeList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Double> gradesMath=new ArrayList<>(Arrays.asList(4.20, 5.80, 3.40, 6.00, 4.50));
        List<Double> gradesPhysics=new ArrayList<>(Arrays.asList(3.20, 4.60, 3.90, 5.00, 4.40));

        List<Double> allGrades=new ArrayList<>();
        allGrades.addAll(gradesMath);
        allGrades.addAll(gradesPhysics);


        System.out.println(allGrades);

    }
}
