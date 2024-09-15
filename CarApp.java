package challenge_11_Vehicles;

import challenge_11_Vehicles.car.Car;
import challenge_11_Vehicles.car.Tesla;

public class CarApp {
    public static void main(String[] args) {

        System.out.println();
        //create new object
        Car myCar = new Car("Dacia Duster", "5", 2010);

        //afisare detalli masina Tesla
        myCar.displayDetails();

        //activitati masina pornit, accelerat, oprit
        myCar.start();
        myCar.accelerate();
        myCar.stop();

        System.out.println("===============================================================");
        //create new object
        Tesla myTesla = new Tesla("Tesla", "Model 5", 2023, 100, 600, "v10.2");

        //afisare detalli masina Tesla
        myTesla.displayDetails();

        //activitati masina pornit, accelerat, si activare autopilot
        myTesla.start();
        myTesla.accelerate();
        myTesla.enableAutopilot();
        myTesla.stop();
        myTesla.charge();


    }
}
