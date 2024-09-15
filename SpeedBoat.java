package challenge_11_Vehicles.watercraft;

public class SpeedBoat extends Boat {
    private int maxSpeed;
    private String engineType;

    //Constructor speedboat
    public SpeedBoat(int length, int weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    //get er si set er pentru variabile
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
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
        System.out.println("Viteză maximă: " + getMaxSpeed() + " km/h, Tip motor: " + getEngineType());
    }



}
