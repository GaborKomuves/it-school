package challenge_11_Vehicles.watercraft;

public class Boat {
    int length;
    int weight;

    // Constructor pentru Boat
    public Boat(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    // Metoda pentru a porni barca
    public void sail() {
        System.out.println("Barca navigheaza.");
    }

    // Afisarea detaliilor despre barca
    public void displayDetails() {
        System.out.println("Lungime barcă: " + length + " metri, Greutate: " + weight + " kg.");
    }
}
