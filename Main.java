package challenge_12_Person;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Parent firstObj = new FirstSubclass();
        firstObj.message();
        System.out.println();
        Parent secondObj = new SecondSubclass();
        secondObj.message();

    }
}
