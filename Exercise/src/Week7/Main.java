package Week7;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Date still = null;
        Patient patient1 = new Patient("Lee", new Date(2000,05,01), still, "Arm");
        Patient patient2 = new Patient("Park", new Date(2000,06,01), still, "internal");
        Physician physician = new Physician("Kim", new Date(1950,06,25), still, "HYU");
        Doctor doctor = new Doctor("Park", new Date(1997, 9, 04), still, "HYU");

        System.out.println("Nurse: please tell me your name and birthday. what's your problem?");
        System.out.println(patient1.toString());
        System.out.println("Lee : hmm..who is my doctor");
        System.out.println(physician.toString());
        System.out.println(doctor.toString());
        System.out.println();
        System.out.println("Lee : Doctor, I'm in trouble with my " + patient1.getDepartment());
        System.out.printf("Doctor: sorry, ");
        doctor.examination(patient1);
        System.out.println("Doctor : Professor ! please help me..");
        System.out.printf("Professor: ");
        physician.examination(patient1);
        System.out.println("Lee : ?");
        System.out.println("Park : Professor, How about me? I'm in trouble with my " + patient2.getDepartment());
        System.out.printf("Professor: ");
        physician.examination(patient2);
    }
}
