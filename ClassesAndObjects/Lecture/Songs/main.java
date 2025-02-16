package ClassesAndObjects.Lecture.Songs;

import ClassesAndObjects.Lecture.Students.Student;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        List<Song> songs=new ArrayList<>();
        String[] info;
        for(int i=1;i<=n;i++){
            String input=s.nextLine();
            info=input.split("_");
            String type=info[0];
            String name=info[1];
            String time=info[2];

            Song song=new Song(type, name, time);
            songs.add(song);
        }

        String searchedType=s.nextLine();
        for(Song song:songs){
            if(searchedType.equals(song.getTypeList())){
                System.out.println(song.getName());
            }
            else if(searchedType.equals("all")){
                System.out.println(song.getName());
            }
        }

    }
}
