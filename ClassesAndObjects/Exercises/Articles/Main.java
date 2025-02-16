package ClassesAndObjects.Exercises.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input=s.nextLine();

        String[] data=input.split(",");
        String title=data[0];
        String content=data[1];
        String author=data[2];

        Article ar=new Article(title,content,author);

        int n=Integer.parseInt(s.nextLine());
        for(int i=0;i<n;i++){
            String command=s.nextLine();
            String[] parts=command.split(":");
            String methodName=parts[0];
            switch (methodName){
                case "Edit"->ar.edit(parts[1]);
                case "ChangeAuthor"->ar.changeAuthor(parts[1]);
                case "Rename"->ar.rename(parts[1]);
            }
        }
        System.out.println(ar);
    }
}
