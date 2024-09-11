package challenge_11_Vehicles.watercraft;

public class SpeedBoat extends Boat {
    int maxSpeed;
    String engineType;

    //Constructor speedboat
    public SpeedBoat(int length, int weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    //activarea turbo
    public void turboBoost() {
        System.out.println("Turbo activat! Barca accelerează rapid.");
    }

    //metoda de afisare detalii barca
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Viteză maximă: " + maxSpeed + " km/h, Tip motor: " + engineType);
    }



}
