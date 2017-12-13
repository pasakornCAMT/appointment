package Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddPatientPage extends Page {
    int id;
    String name;
    @Override
    public void show() {
        System.out.println("ID: ");
        id = scan.nextInt();
        System.out.println("Name: ");
        name=scan.next();
        creator.addPatient(id,name);
    }
}
