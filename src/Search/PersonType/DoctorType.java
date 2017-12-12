package Search.PersonType;

import Search.PersonType.InputType.InputSelector;

public class DoctorType implements PersonSelector {
    InputSelector inputType;
    String person;

    @Override
    public void operation(InputSelector inputSelector) {
        this.person = "Doctor";
    }

    public DoctorType(InputSelector inputSelector){
        this.inputType = inputSelector;
        operation(this.inputType);
        exe(this.person);
    }

    public void exe(String person){
        inputType.operation2(person);
    }
}
