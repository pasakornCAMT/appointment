import Creator.Creator;
import User.Doctor;

public class ClinicAppointmentApplication {
    public static void main(String[] args) {
        System.out.println("Hello World");

       Creator c = new Creator();
       Doctor doc1 = c.createDoctor(1,"pu");
    }
}
