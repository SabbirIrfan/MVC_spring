package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


 private String tittle;
 private String content;

    public Note() {
        super();
    }

    public Note(String tittle, String content) {
        this.tittle = tittle;
        this.content = content;
    }

    public Note(int id, String tittle, String content) {
        this.id = id;
        this.tittle = tittle;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
