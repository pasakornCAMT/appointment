package User;

import User.Appointment.Appointment;

import java.util.List;

public class Doctor implements Person {
    protected String name,gender;
    protected int age,doctorId;
    protected List<Appointment> appointments;

    @Override
    public void getData(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void getDoctorData(int doctorId){
        this.doctorId = doctorId;
    }

}
