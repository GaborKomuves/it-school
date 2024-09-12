package challenge_11_Vehicles.bicycle;

public class Bicycle {
    private int speed;
    private int gear;

    //constructor
    public Bicycle(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    //get er si set er pentru speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //get er si set er pentru gear
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void changeGear(int newGear){
        this.gear = newGear;
        System.out.println("viteza schimbata la: " + newGear);
    }

    public void speedUp(int increment){
        this.speed += increment;
        System.out.println("Viteza crescuta cu: " + increment + " km/h. Viteza curenta:" + speed);
    }

    public void  applyBrake(int decrement){
        this.speed -= decrement;
        System.out.println("Viteza scazuta cu: " + decrement + " km/h. Viteza curenta: " + speed);
    }

}
