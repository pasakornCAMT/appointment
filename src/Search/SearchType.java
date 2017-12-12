package Search;

import Search.PersonType.InputType.InputSelector;
import Search.PersonType.PersonSelector;

public class SearchType {
    private PersonSelector personType;
    private InputSelector inputType;

    public SearchType(PersonSelector personType){
        this.personType = personType;
    }

    public void execute(){
        personType.operation(this.inputType);
    }
}
