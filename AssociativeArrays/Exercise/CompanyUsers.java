package AssociativeArrays.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Map<String, List<String>> companies=new LinkedHashMap<>();

        String input=s.nextLine();
        while(!input.equals("End")){
            String[] dataInput=input.split(" -> ");
            String name=dataInput[0];
            String id=dataInput[1];
            if(companies.containsKey(name) ){
                List<String> currentEmployees=companies.get(name);
                if(!currentEmployees.contains(id)){
                    currentEmployees.add(id);
                }
            }
            else{
          companies.putIfAbsent(name, new ArrayList<>());
          companies.get(name).add(id);}

            input=s.nextLine();
        }

      for(Map.Entry<String, List<String>> entry: companies.entrySet()){
          System.out.printf("%s%n", entry.getKey());
          for(String id: companies.get(entry.getKey())){
              System.out.printf("-- %s%n", id);
          }
      }


    }
}
