package AssociativeArrays.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        Map<String, List<Double>> studentGrades=new LinkedHashMap<>();

        for(int i=0;i<n;i++){
            String name=s.nextLine();
            double grade=Double.parseDouble(s.nextLine());

            studentGrades.putIfAbsent(name, new ArrayList<>());
            studentGrades.get(name).add(grade);

        }

        double sum=0;
        for(String name:studentGrades.keySet()){
            List<Double> grades=studentGrades.get(name);
            for(double gr:grades){
                sum+=gr;

            }
            int size=grades.size();
            double average=sum/size;
            if(average>=4.50){
                System.out.printf("%s -> %.2f%n", name, average);
            }
            sum=0;
        }
    }
}
