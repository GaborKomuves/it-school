package challenge_11_Vehicles.car;

public class Car {
    String make;
    String model;
    int year;

    // constructor
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }


    //metoda porneste masina
    public void start(){
        System.out.println("Masina a pornit!");
    }

    //metoda de oprit masina
    public void stop(){
        System.out.println("Masina s a oprit!");
    }
    //metoda de accelerare
    public void accelerate(){
        System.out.println("Masina accelereaza!");
    }

    //afisare detalii
    public void displayDetails(){
        System.out.println("Marca: " + make + ". Model: " + model + ". An fabricatie: " + year);
    }


}
