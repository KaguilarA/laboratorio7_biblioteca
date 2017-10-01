package laboratorio7;

/**
 *
 * @author kevin
 */
public class Other extends User{
    
    protected String description;

    public Other() {
        super();
    }

    public Other(String description, String pidentification, String pname, String psurname, String psecondSurname) {
        super(pidentification, pname, psurname, psecondSurname);
        this.description = description;
    }

    // Gets
    public String getDescription() {
        return description;
    }
    
    // Sets
    public void setDescription(String description) {
        this.description = description;
    }
    
    // To String
    @Override
    public String toString() {
        return super.toString() + "Descripcion = " + description;
    }
    
}
