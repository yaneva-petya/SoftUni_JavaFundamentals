package AssociativeArrays.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //"force_side | force_user" OR "force_user -> force_side";
        String input=s.nextLine();

        //key->user, value->side;
        Map<String, String> userAndSide=new LinkedHashMap<>();
        //key->side, value->count;
        Map<String, Integer> sideAndCount=new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){
            String[] data=input.split("\\s+");
            String command=data[1];

            switch (command){
                case "|":{
                    String side=data[0];
                    String user=data[2];
                    if(!userAndSide.containsKey(user)){
                        userAndSide.put(user,side);
                    }

                    if(!sideAndCount.containsKey(side)){
                        sideAndCount.put(side,1);
                    }
                    else{
                        int currentCount=sideAndCount.get(side);
                        sideAndCount.put(side, currentCount+1);
                    }
                    break;
                }
                case "->":
                    String user=data[0];
                    String side=data[2];

                   if(!userAndSide.containsKey(user)){
                       userAndSide.put(user, side);
                       System.out.printf("%s joins the %s side!%n", user, side);
                   }
                   else{
                       String pastSide=userAndSide.get(user);
                       userAndSide.replace(user, side);
                       int currentPastCount=sideAndCount.get(pastSide);
                       sideAndCount.replace(pastSide, currentPastCount-1);
                       int currentCount=sideAndCount.get(pastSide);
                       sideAndCount.replace(side, currentCount+1);
                   }

            }


            input=s.nextLine();
        }

        sideAndCount.entrySet().forEach(entry->System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue()));
        for(Map.Entry<String, String> entry: userAndSide.entrySet()){
            System.out.printf("! %s%n", entry.getKey());
        }
    }
}
