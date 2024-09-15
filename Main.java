package challenge_12_Student;

public class Main {
    public static void main(String[] args) {
        System.out.println();//adaugat un rand intre prima afisare si mesaju;lIntelij
        // Creare obiect student A
        Marks studentA = new StudentA(85, 90, 78);
        System.out.println("Procent pentru studentul A: " + studentA.getPercentage() + "%");

        System.out.println();//adaugat un rand intre afisari
        // Am creat si pentru stundent B
        Marks studentB = new StudentB(75, 80, 85, 90);
        System.out.println("Procent pentru studentul B: " + studentB.getPercentage() + "%");
    }
}
