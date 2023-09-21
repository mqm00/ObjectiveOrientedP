package Week7;
import Week5.*;
import java.util.Date;

public class Patient extends Person{
    public Patient(String _name, Date _born, Date _died, String department) {
        super(_name, _born, _died);
        this.department = department;
    }

    private String department;

    @Override
    public String toString(){
        return super.toString()+ " " + this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }



}
