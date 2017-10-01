package laboratorio7;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class Audiovisual extends Material{
    protected String format, duration;

    public Audiovisual() {
    }

    public Audiovisual(String format, String duration, String tittle, String author, String language, Date publishDate) 
    {
        super(tittle, author, language, publishDate);
        this.format = format;
        this.duration = duration;
    }

    // Getts
    public String getFormat() {
        return format;
    }
    public String getDuration() {
        return duration;
    }
    
    // Setts
    public void setFormat(String format) {
        this.format = format;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    // To String

    @Override
    public String toString() {
        return super.toString() + ", Formato=" + format + ", Duracion=" + duration;
    }
    
    
}
