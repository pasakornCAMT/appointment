package Creator;

import User.Appointment.Appointment;
import User.Doctor;
import User.Patient;

import java.util.Date;

public class Creator {
    public Appointment createAppointment(Doctor doc, Patient pat, Date date) {
        return new Appointment();
    }

    public Doctor createDoctor(int id, String name) {
        return new Doctor();
    }

    public Patient patient(int id, String name) {
        return new Patient();
    }
}
