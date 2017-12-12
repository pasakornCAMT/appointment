package Interface;

import Creator.Creator;

public class InterfaceFacade {
    Page mainPage,addPatient,addDoctor;
    public InterfaceFacade(){
        mainPage=new MainPage();
        addPatient=new AddNewPatient();
        addDoctor=new AddNewDoctor();
    }

    public void showMainPage(){
        mainPage.show();
    }
    public void showAddPatienPage(){
        addPatient.show();
    }
    public void showAddDoctor(){
        addDoctor.show();
    }
}
