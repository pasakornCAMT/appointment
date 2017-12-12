package Search.PersonType.InputType;

public class nameType implements InputSelector {
    @Override
    public void operation2(String person) {
        System.out.println("Search by "+person+" name work!!!");
    }
}
