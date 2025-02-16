package ClassesAndObjects.Lecture.Songs;

public class Song {
    private String typeList;
    private String name;
    private String Time;

    public Song(){
        String typeList=" ";
        String name=" ";
        String time=" ";
    }

    public Song(String typeList, String name, String time){
        setTypeList(typeList);
        setName(name);
        setName(name);
    }
    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }
}
