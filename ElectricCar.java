package challenge_11_Vehicles.car;

public class ElectricCar extends Car{
    private int batteryCapacity;
    private int range;

    //constructor masina electrica
    public ElectricCar(String make, String model, int year, int batteryCapacity, int range){
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    //get er si set er
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    //suprascrierea methode displayDetails
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Capacitate baterie: " + getBatteryCapacity() + " kWh, Autonomie: " + getRange() + " km.");
    }

}
