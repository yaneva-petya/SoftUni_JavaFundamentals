package ClassesAndObjects.Exercises.Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(){
        String title=" ";
        String content=" ";
        String author=" ";
    }
    public Article(String title, String content, String author){
        setTitle(title);
        setContent(content);
        setAuthor(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String edit(String newContent){
        this.content=newContent;
        return content;
    }

    public String changeAuthor(String newAuthor){
        this.author=newAuthor;
        return author;
    }
    public String rename(String newName){
        this.title=newName;
        return title;
    }

    @Override
    public String toString() {
        return this.title + " -" + this.content + ":" + this.author;
    }
}
