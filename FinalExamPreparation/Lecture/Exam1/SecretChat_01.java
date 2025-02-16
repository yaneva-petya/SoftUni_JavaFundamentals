package FinalExamPreparation.Lecture.Exam1;


import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        StringBuilder message= new StringBuilder(s.nextLine());
        String command=s.nextLine();

        while (!command.equals("Reveal")){
           //String currentCommand=command.split(":\\|:")[0];
            String[] data=command.split(":\\|:");
            String currentCommand=data[0];
            switch (currentCommand){
                case "InsertSpace" ->{
                   int index=Integer.parseInt(data[1]);
                   message.insert(index," ");
                   System.out.println(message);
                }
                case "Reverse"->{
                    StringBuilder substring=new StringBuilder(data[1]);
                  //  substring.reverse();
                    if(!message.toString().contains(substring)){
                        System.out.println("error");
                    }else {
                        int firstIndex=message.indexOf(String.valueOf(substring));
                        //int lastIndex=message.lastIndexOf(String.valueOf(substring));
                        int lastIndex=firstIndex+substring.length();

                        String reversedString=substring.reverse().toString();

                        //изтриваме стринга при първия срещнат път
                        message.delete(firstIndex,lastIndex);
                        message.append(reversedString);
                        System.out.println(message);
                    }
                }
                case "ChangeAll"->{
                     String substring=data[1];

                     String replacement=data[2];
                     while (message.toString().contains(substring)){
                         int firstIndex=message.indexOf(substring.toString());
                         int lastIndex=firstIndex+substring.length();
                         message.replace(firstIndex,lastIndex,replacement);
                     }

                     System.out.println(message);
                }
            }


            command=s.nextLine();
        }
        System.out.print("You have a new text message: "+ message);
    }
}
