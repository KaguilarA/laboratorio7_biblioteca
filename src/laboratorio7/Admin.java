package laboratorio7;

/**
 *
 * @author kevin
 */
public class Admin extends User{
    protected int adminType, weeklyHours;

    public Admin() {
        super();
    }

    public Admin(int adminType, int weeklyHours, String pidentification, String pname, String psurname, String psecondSurname) {
        super(pidentification, pname, psurname, psecondSurname);
        this.adminType = adminType;
        this.weeklyHours = weeklyHours;
    }

    // Gets
    public int getAdminType() {
        return adminType;
    }
    public int getWeeklyHours() {
        return weeklyHours;
    }
    
    // Sets
    public void setAdminType(int adminType) {
        this.adminType = adminType;
    }
    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de administrador = " + adminType + ", Horas de trabajo semanales asignadas=" + weeklyHours;
    }
    
    
}
