package laboratorio7;

/**
 *
 * @author kevin
 */
public class Student extends User{
    
    protected String carrer;
    protected int credits;

    public Student() {
        super();
    }

    public Student(String carrer, int credits, String pidentification, String pname, String psurname, String psecondSurname) {
        super(pidentification, pname, psurname, psecondSurname);
        this.carrer = carrer;
        this.credits = credits;
    }

    // Gets
    public String getCarrer() {
        return carrer;
    }
    public int getCredits() {
        return credits;
    }

    // Sets
    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carrera = " + carrer + ", Creditos=" + credits;
    }
    
    
    
    
}
