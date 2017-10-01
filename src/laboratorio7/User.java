/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio7;

/**
 *
 * @author kevin
 */
public class User {
    
    protected String identification, name, surname, secondSurname;

    public User()
    {
    }

    public User(String pidentification, String pname, String psurname, String psecondSurname) 
    {
        this.identification = pidentification;
        this.name = pname;
        this.surname = psurname;
        this.secondSurname = psecondSurname;
    }
    
    // Gets
    public String getIdentification() {
        return identification;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getSecondSurname() {
        return secondSurname;
    }

    // Sets
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    
    // To Srings
    @Override
    public String toString() {
        return "Identificacion = " + identification + ", Nombre = " + name + ", Peimer apellido = " + surname + ", Segundo Apellido = " + secondSurname;
    }
    
    
    
    
    
    
}
