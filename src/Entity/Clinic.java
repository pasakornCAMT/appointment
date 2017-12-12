package Entity;

import User.Appointment.Appointment;
import User.Doctor;
import User.Patient;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    List<Patient> patientList;
    List<Doctor> doctorList;
    List<Appointment> appointmentList;

    public Clinic() {
        this.patientList = patientList();
        this.doctorList = doctorList();
    }

    public static List<Doctor> doctorList() {
        List<Doctor> doctorList = new ArrayList<Doctor>();
        doctorList.add(new Doctor(100,"doctor1"));
        doctorList.add(new Doctor(101,"doctor2"));
        doctorList.add(new Doctor(102,"doctor3"));
        return doctorList;

    }

    public static List<Patient> patientList() {
        List<Patient> patieatList = new ArrayList<Patient>();
        patieatList.add(new Patient(1,"pat1"));
        patieatList.add(new Patient(2,"pat2"));
        patieatList.add(new Patient(3,"pat3"));
        patieatList.add(new Patient(4,"pat4"));
        return patieatList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }
}
