package challenge_12_Bank;

public class Main {
    public static void main(String[] args) {
        //creez 3 obiecte
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        // afisam balanta
        System.out.println("Balanta cont A: " + bankA.getBalance() + " RON.");
        System.out.println("Balanta cont B: " + bankB.getBalance() + " RON.");
        System.out.println("Balanta cont C: " + bankC.getBalance() + " RON.");
    }

}
