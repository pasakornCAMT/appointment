package Interface;

public class AddDoctorPage extends Page {
    int id;
    String name;
    @Override
    public void show() {
        System.out.println("ID: ");
        id = scan.nextInt();
        System.out.println("Name: ");
        name=scan.next();
        creator.addDoctor(id,name);

    }
}
