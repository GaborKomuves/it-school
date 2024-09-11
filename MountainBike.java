package challenge_11_Vehicles.bicycle;

public class MountainBike extends Bicycle{
    String tyreType;
    String suspension;
    public MountainBike(int speed, int gear, String tyreType, String suspension){
        super(speed,gear);
        this.tyreType = tyreType;
        this.suspension = suspension;
    }

    public void adjustSuspension(String newSuspension){
        this.suspension = newSuspension;
        System.out.println("Suspensia ajustata la " + newSuspension);
    }

    public void displayDetails(){
        System.out.println("Viteza curenta: " + speed + " km/h. Viteza: " + gear + ". Tip de anvelopa: " + tyreType + " si  suspensie: " + suspension);
    }


}
