package Search.PersonType.InputType;

public class idType implements InputSelector{
    @Override
    public void operation2(String person) {
        System.out.println("Search by "+person+" id work!!!");
    }
}
