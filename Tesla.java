package challenge_11_Vehicles.car;

public class Tesla extends Car{
    private String autopilotVersion;

    //constructor masina Tesla
    public Tesla(String make, String model, int year, int batteryCapacity, int range, String autopilotVersion) {
        super(make, model, year);
        this.autopilotVersion = autopilotVersion;
    }

    //get er si set er pentru autopilot
    public String getAutopilotVersion() {
        return autopilotVersion;
    }

    public void setAutopilotVersion(String autopilotVersion) {
        this.autopilotVersion = autopilotVersion;
    }

    //metoda activare autopilot
    public void enableAutopilot(){
        System.out.println("Autopilotul a fost activat. Versiunea: " + autopilotVersion);
    }

    //metoda pentru a incarca masina electrica
    public void charge() {
        System.out.println("Masina electrica se incarca!");
    }


    //afisare metoda suprascrisa detalii
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Versiune autopilot: " + getAutopilotVersion());
    }



}
