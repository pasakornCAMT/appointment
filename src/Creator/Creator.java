package Creator;

import User.Appointment.Appointment;
import User.Date.DateAppointment;
import User.Doctor;
import User.Patient;


public class Creator {
    public Appointment createAppointment(DateAppointment date, Doctor doctor, Patient patient) {
        return new Appointment(date,doctor,patient);
    }

    public Doctor addDoctor(int id, String name) {
        return new Doctor(id,name);
    }

    public Patient addPatient(int id, String name) {
        return new Patient(id,name);
    }
}
