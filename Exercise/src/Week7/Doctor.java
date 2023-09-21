package Week7;
import Week5.*;
import java.util.Date;

public class Doctor extends Person{
    private String hospital;

    public Doctor(String _name, Date _born, Date _died, String hospital) {
        super(_name, _born, _died);
        this.hospital = hospital;
    }

    public String getHospital(){
        return this.hospital;
    }

    public void setHospital(){
        this.hospital = hospital;
    }

    @Override
    public String toString(){
        return "[Doctor] " + super.toString() + " Affiliation : "+ this.hospital;
    }

    public boolean equals(Doctor d){
        return super.equals(d) && this.hospital.equals(d.hospital);
    }

    public void examination(Patient P){
        System.out.println("I haven't decided my major yet");
    }
}
