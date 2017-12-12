import Creator.Creator;
import User.Appointment.Appointment;
import User.Date.DateAppointment;
import User.Doctor;
import User.Patient;


public class ClinicAppointmentApplication {
    public static void main(String[] args) {
        System.out.println("Hello World");

       Creator c = new Creator();
       Doctor doc1 = c.addDoctor(1,"pu");
       Patient patient = c.addPatient(2,"pp");

       System.out.println(doc1.getName());
       doc1.getName();

        DateAppointment dateAppointment = new DateAppointment(12,12,2017,8,20);

        Appointment appointment = c.createAppointment(dateAppointment,doc1,patient);




    }
}
