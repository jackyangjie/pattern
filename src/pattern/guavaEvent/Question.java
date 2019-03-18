package pattern.guavaEvent;

import java.util.Date;

public class Question {
    private String title;
    private String content;
    private Date time;
    private String author;

    public Question(String title, String content, Date time, String author) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.author = author;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Question{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", author='" + author + '\'' +
                '}';
    }
}
