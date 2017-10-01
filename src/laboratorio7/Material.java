package laboratorio7;

/**
 *
 * @author kevin
 */

import java.util.Date;

public class Material {
    
    protected String tittle, author, language;
    protected Date publishDate;

    public Material() {
    }

    public Material(String tittle, String author, String language, Date publishDate) {
        this.tittle = tittle;
        this.author = author;
        this.language = language;
        this.publishDate = publishDate;
    }
    
    // Gets
    public String getTittle() {
        return tittle;
    }
    public String getAuthor() {
        return author;
    }
    public String getLanguage() {
        return language;
    }
    public Date getPublishDate() {
        return publishDate;
    }
    
    // Sets
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    // To String
    @Override
    public String toString() {
        return "Titulo = " + tittle + ", Autor = " + author + ", Lenguaje = " + language + ", Fecha de publicacion=" + publishDate;
    }
}
