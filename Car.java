package challenge_11_Vehicles.car;

public class Car {
    private String make;
    private String model;
    private int year;

    // constructor
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //geter si setter pentru make, model si year


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
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
        System.out.println("Marca: " + getMake() + ". Model: " + getModel() + ". An fabricatie: " + getYear());
    }


}
