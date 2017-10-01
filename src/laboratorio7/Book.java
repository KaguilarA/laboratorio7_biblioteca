package laboratorio7;

/**
 *
 * @author kevin
 */
public class Book extends User{
    
    protected int cantPages;

    public Book() {
    }

    public Book(int cantPages, String pidentification, String pname, String psurname, String psecondSurname) {
        super(pidentification, pname, psurname, psecondSurname);
        this.cantPages = cantPages;
    }

    // Gets
    public int getCantPages() {
        return cantPages;
    }

    // Sets
    public void setCantPages(int cantPages) {
        this.cantPages = cantPages;
    }
    
    // To String
    @Override
    public String toString() {
        return super.toString() + "Cantidad de paginas = " + cantPages;
    }
}
