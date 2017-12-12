package User.Appointment;

import User.Doctor;
import User.Patient;

import java.util.Date;

public class Appointment {
    private Date date;
    Doctor doctor;
    Patient patient;

    public Appointment() {
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
