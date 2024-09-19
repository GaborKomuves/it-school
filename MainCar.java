package challenge_13.car;

public class MainCar {
    public static void main(String[] args) {
        Car myCar = new Limo();

        Limo myLimo = (Limo) myCar;

        myLimo.start();
        myLimo.horn();



    }
}
