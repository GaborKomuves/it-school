package challenge_11_Vehicles.watercraft;

public class FishingBoat extends Boat{
    int fishCapacity;
    String typeOfNet;

    //constructor fishinboat
    public FishingBoat(int length, int weight, int fishCapacity, String typeOfNet) {
        super(length, weight); // Apelăm constructorul din Boat
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    //metoda de aruncare a plasei de pescuit
    public void castNet() {
        System.out.println("Plasa de pescuit a fost aruncata.");
    }

    //afisare detalii fishboat
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacitate pește: " + fishCapacity + " kg, Tip plasă: " + typeOfNet);
    }

}
