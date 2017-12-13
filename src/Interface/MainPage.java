package Interface;

public class MainPage extends Page{
    @Override
    public void show() {
        String end ="x";
        String command="";

        while(!command.equals(end)) {

            facade.showMenuPage();

            command = scan.next();
            switch (command) {
                case "AP"
                        :facade.showAddPatienPage();
                break;

                case "AD"
                        :facade.showAddDoctorPage();
                break;

                case "MA"
                    :facade.showMakeAppointmentPage();
                    break;

                default
                        :facade.showMainPage();
                break;
            }
        }
    }
}
