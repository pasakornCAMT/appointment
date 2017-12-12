package Interface;

public class AddNewDoctor extends Page {
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
