package Interface;

import Creator.Creator;
import User.Date.DateAppointment;
import User.Doctor;
import User.Patient;

public class MakeAppointPage extends Page {
    DateAppointment dateAppointment;
    Doctor doctor;
    Patient patient;
    @Override
    public void show() {
        System.out.println("Date:");
        System.out.println("Doctor:");
        System.out.println("Patient");
        creator.createAppointment(dateAppointment,doctor,patient);
    }
}
