package TextProcessing.Exercise;

import java.util.*;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();

        input=input.replace("C:\\", "");

       int lastSlash=input.lastIndexOf("\\");
       String text=input.substring(lastSlash+1);
       //System.out.println(text);

       String[] file=text.split("\\.");
       System.out.print("File name: "+file[0]);
       System.out.println();
       System.out.print("File extension: "+ file[1]);


    }
}
