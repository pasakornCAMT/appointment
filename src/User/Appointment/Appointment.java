package User.Appointment;

import User.Date.DateAppointment;
import User.Doctor;
import User.Patient;


public class Appointment {
    private DateAppointment date;
    Doctor doctor;
    Patient patient;

    public Appointment(DateAppointment date, Doctor doctor, Patient patient) {
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
    }

    public DateAppointment getDate() {
        return date;
    }

    public void setDate(DateAppointment date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
