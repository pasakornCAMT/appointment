package User;

import User.Appointment.Appointment;

import java.util.List;

public class Doctor extends Person {

    protected List<Appointment> appointments;

    public Doctor(int id, String name) {
        super(id, name);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
