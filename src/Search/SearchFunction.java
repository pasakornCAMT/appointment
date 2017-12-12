package Search;

import Search.PersonType.DoctorType;
import Search.PersonType.InputType.idType;
import Search.PersonType.InputType.nameType;
import Search.PersonType.PatientType;

import java.util.Scanner;

public class SearchFunction {
    String type, type2;
    SearchType personType;

    public void Search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You are [1] Doctor ,[2] Patient : ");
        String type = scanner.next();
        if (type.equals("1")) {
            this.type = "Doctor";

            InputType();
        } else if (type.equals("2")) {
            this.type = "Patient";
            InputType();
        } else {
            System.out.println("Out of selection");
//          Link to MAIN MENU
        }
    }

    private void InputType() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search by [1] ID ,[2] Name : ");
        String type = scanner.next();
        if (this.type.equalsIgnoreCase("Doctor")) {
            if (type.equals("1")) {
                this.type2 = "ID";
                personType = new SearchType(new DoctorType(new idType()));
                personType.execute();
            } else if (type.equals("2")) {
                this.type2 = "Name";
                personType = new SearchType(new DoctorType(new nameType()));
                personType.execute();
            } else {
                System.out.println("Out of selection");
//          Link to MAIN MENU
            }
        } else if (this.type.equalsIgnoreCase("Patient")) {
            if (type.equals("1")) {
                this.type2 = "ID";
                personType = new SearchType(new PatientType(new idType()));
                personType.execute();
            } else if (type.equals("2")) {
                this.type2 = "Name";
                personType = new SearchType(new PatientType(new nameType()));
                personType.execute();
            } else {
                System.out.println("Out of selection");
//          Link to MAIN MENU
            }
        }
    }
}
