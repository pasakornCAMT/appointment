package Interface;

public class MenuPage extends Page{
    @Override
    public void show() {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Add new patient...Press[AP]");
        System.out.println("Add new doctor...Press[AD]");
        System.out.println("Remove doctor...Press[RD]");
        System.out.println("Make appointment...Press[MA]");
        System.out.println("Remove doctor's appointment...Press[RDA]");
        System.out.println("Remove patient's appointment...Press[RPA]");
        System.out.println("Display doctor's Appointment by Citizen ID...Press[DDA]");
        System.out.println("Display patient's Appointment by Citizen ID...Press[DPA]");
        System.out.println("Search doctor's Information by Name OR Citizen ID...Press[SD]");
        System.out.println("Search patient's Information by Name OR Citizen ID...Press[SP]");
        System.out.println("Exit and End ...Press [x]");
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
