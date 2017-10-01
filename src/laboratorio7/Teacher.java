package laboratorio7;

/**
 *
 * @author kevin
 */

import java.util.Date;

public class Teacher extends User{
    protected int contractType;
    protected Date contractDate;

    public Teacher() {
        super();
    }

    public Teacher(int contractType, Date contractDate, String pidentification, String pname, String psurname, String psecondSurname) {
        super(pidentification, pname, psurname, psecondSurname);
        this.contractType = contractType;
        this.contractDate = contractDate;
    }

    // Gets
    public int getContractType() {
        return contractType;
    }
    public Date getContractDate() {
        return contractDate;
    }
    
    // Sets
    public void setContractType(int contractType) {
        this.contractType = contractType;
    }
    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }
    
    // To String
    @Override
    public String toString() {
        return super.toString() + "Tipo de contrato = " + contractType + ", Fecha de contratacion = " + contractDate;
    }
    
}
