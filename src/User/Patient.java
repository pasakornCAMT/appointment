package User;

import User.Appointment.Appointment;

public class Patient extends Person{
    protected String symptoms;
    protected Appointment appointment;

    public Patient(int id, String name) {
        super(id, name);
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
