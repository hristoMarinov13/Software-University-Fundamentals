package ObjectsAndClasses;

public class Article {
    private String title;
    private String content;
    private String author;


    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void Edit(String newContent){
        this.content = newContent;

    }
    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void rename(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString() {
        String str = this.title + " - " + this.content + ":" + this.author;
        return str;
    }
}
