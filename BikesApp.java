package challenge_11_Vehicles;

import challenge_11_Vehicles.bicycle.Bicycle;
import challenge_11_Vehicles.bicycle.MountainBike;

public class BikesApp {
    public static void main(String[] args) {


        System.out.println();
        //obiec creat pentru bicicleta
        Bicycle bicycle = new Bicycle(15,5);
        bicycle.changeGear(2);
        bicycle.speedUp(10);
        bicycle.applyBrake(5);


        System.out.println("=============================================================");
        //obiect nou pentru mountain bike
        MountainBike myBike = new MountainBike(20,5,"Off-road","Dual");
        myBike.displayDetails();
        myBike.changeGear(3);
        myBike.speedUp(10);
        myBike.applyBrake(5);
        myBike.adjustSuspension("Soft");
        myBike.displayDetails();

    }
}
