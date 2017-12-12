package User;

public class Patient implements Person{
    protected String name,gender,Symtomp;
    protected int age,patientId;

    @Override
    public void getData(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void getPatientData(int patientId ,String Symtomp){
        this.patientId = patientId;
        this.Symtomp = Symtomp;
    }


}
