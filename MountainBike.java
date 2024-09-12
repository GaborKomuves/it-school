package challenge_11_Vehicles.bicycle;

public class MountainBike extends Bicycle{
    private String tyreType;
    private String suspension;

    //constructor
    public MountainBike(int speed, int gear, String tyreType, String suspension){
        super(speed,gear);
        this.tyreType = tyreType;
        this.suspension = suspension;
    }

    //get er si set er pentru cauciuc
    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    //get er si set er pentru suspensie
    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public void adjustSuspension(String newSuspension){
        this.suspension = newSuspension;
        System.out.println("Suspensia ajustata la " + newSuspension);
    }

    public void displayDetails(){
        System.out.println("Viteza curenta: " + getSpeed() + " km/h. Viteza: " + getGear() + ". Tip de anvelopa: " + getTyreType() + " si  suspensie: " + getSuspension());
    }


}
