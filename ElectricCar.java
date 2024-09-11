package challenge_11_Vehicles.car;

public class ElectricCar extends Car{
    int batteryCapacity;
    int range;

    //constructor masina electrica
    public ElectricCar(String make, String model, int year, int batteryCapacity, int range){
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }





    //suprascrierea methode displayDetails
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Capacitate baterie: " + batteryCapacity + " kWh, Autonomie: " + range + " km.");
    }

}
