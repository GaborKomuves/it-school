package challenge_11_Vehicles;

import challenge_11_Vehicles.watercraft.Boat;
import challenge_11_Vehicles.watercraft.FishingBoat;
import challenge_11_Vehicles.watercraft.SpeedBoat;

public class BoatApp {
    public static void main(String[] args) {
        System.out.println();
        // Cream un obiect de tip Boat
        Boat myBoat = new Boat(15, 3000);
        myBoat.displayDetails();
        myBoat.sail();

        System.out.println("=============================================================");

        // Cream un obiect de tip SpeedBoat
        SpeedBoat mySpeedBoat = new SpeedBoat(10, 2000, 85, "Motor V8");
        mySpeedBoat.displayDetails();
        mySpeedBoat.sail();
        mySpeedBoat.turboBoost();

        System.out.println("=============================================================");

        // Cream obiect de tip FishingBoat
        FishingBoat myFishingBoat = new FishingBoat(20, 5000, 1000, "Plasă cu ochiuri mici");
        myFishingBoat.displayDetails();
        myFishingBoat.sail();
        myFishingBoat.castNet();
    }
}
