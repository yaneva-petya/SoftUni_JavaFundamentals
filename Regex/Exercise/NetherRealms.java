package Regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] demons=s.nextLine()
                .replace(" ", "")
                .split(",");

        for(String demon:demons){

           int health=demonHealth(demon);
           double damage=demonDamage(demon);
           System.out.printf("%s - %d health, %.2f damage\n", demon, health, damage);
        }

    }

    public static Integer demonHealth(String demon){
        int health=0;
        for(int i=0;i<demon.length();i++){
            char symbol=demon.charAt(i);
            if(symbol!='+' && symbol!='-' && symbol!='*' && symbol!='/'
            && symbol!='.' && !Character.isDigit(symbol)){
                health+=(int)symbol;
            }
        }
        return health;
    }

    public static Double demonDamage(String demon){
        double damage=0;
        Pattern pattern=Pattern.compile("[-]?[0-9]+\\.?[0-9]*");
        Matcher matcher= pattern.matcher(demon);

        while (matcher.find()){
            damage+=Double.parseDouble(matcher.group());
        }

       for(int i=0;i<demon.length();i++){
           char currentSymbol=demon.charAt(i);
           if(currentSymbol=='*'){
               damage*=2;
           }
           else if(currentSymbol=='/'){
               damage/=2;
           }
       }

        return damage;


    }
}
