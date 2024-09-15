package challenge_11_Vehicles.watercraft;

public class Boat {
    private int length;
    private int weight;

    // Constructor pentru Boat
    public Boat(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    //get er si set er pentru variabile


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Metoda pentru a porni barca
    public void sail() {
        System.out.println("Barca navigheaza.");
    }

    // Afisarea detaliilor despre barca
    public void displayDetails() {
        System.out.println("Lungime barcă: " + getLength() + " metri, Greutate: " + getWeight() + " kg.");
    }
}
