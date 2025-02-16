package AssociativeArrays.Exercise;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        //key->name; value->points;
        Map<String, Integer> userAndPoints=new LinkedHashMap<>();

        //key->language; value->count;
        Map<String, Integer> languagesAndCount=new LinkedHashMap<>();

        //"{username}-{language}-{points}"
        String input=s.nextLine();

        while(!input.equals("exam finished")){
            //Katy-banned
            if(input.contains("banned")){
                String name=input.split("-")[0];
                userAndPoints.remove(name);
            }else{
                //Peter-Java-67
                String name=input.split("-")[0];
                String language=input.split("-")[1];
                int points=Integer.parseInt(input.split("-")[2]);

                if(!userAndPoints.containsKey(name)){
                    userAndPoints.put(name, points);
                }
                else{
                    int existingPoints=userAndPoints.get(name);
                    if(points>existingPoints){
                        userAndPoints.put(name, points);
                    }
                }

                if(!languagesAndCount.containsKey(language)){
                    languagesAndCount.put(language, 1);
                }
                else{
                    int existingCount=languagesAndCount.get(language);
                    languagesAndCount.put(language, existingCount+1);
                }
            }




            input=s.nextLine();
        }

        System.out.println("Results:");
        userAndPoints.entrySet().forEach(entry -> System.out.printf("%s | %d\n", entry.getKey(), entry.getValue()));
        System.out.println("Submissions:");
        languagesAndCount.entrySet().forEach(entry -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue()));

    }


}
