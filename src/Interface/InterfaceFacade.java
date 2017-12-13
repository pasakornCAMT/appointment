package Interface;

public class InterfaceFacade {
    Page mainPage,addPatient,addDoctor,menu,makeAppointment;
    public InterfaceFacade(){
        mainPage=new MainPage();
        addPatient=new AddPatientPage();
        addDoctor=new AddDoctorPage();
        menu=new MenuPage();
        makeAppointment=new MakeAppointPage();
    }

    public void showMainPage(){
        mainPage.show();
    }
    public void showAddPatienPage(){
        addPatient.show();
    }
    public void showAddDoctorPage(){
        addDoctor.show();
    }
    public void showMenuPage(){
        menu.show();
    }
    public void showMakeAppointmentPage(){
        makeAppointment.show();
    }
}
