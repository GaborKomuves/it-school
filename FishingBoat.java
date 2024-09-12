package challenge_11_Vehicles.watercraft;

public class FishingBoat extends Boat{
    private int fishCapacity;
    private String typeOfNet;

    //constructor fishinboat
    public FishingBoat(int length, int weight, int fishCapacity, String typeOfNet) {
        super(length, weight); // Apelăm constructorul din Boat
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    // get er si set er pentru variabile
    public int getFishCapacity() {
        return fishCapacity;
    }

    public void setFishCapacity(int fishCapacity) {
        this.fishCapacity = fishCapacity;
    }

    public String getTypeOfNet() {
        return typeOfNet;
    }

    public void setTypeOfNet(String typeOfNet) {
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
        System.out.println("Capacitate pește: " + getFishCapacity() + " kg, Tip plasă: " + getTypeOfNet());
    }

}
