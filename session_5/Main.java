package session_5;

public class Main {
    enum Level {
        LOW, MEDIUM, HIGH
    }

    public static void main(String[] args) {
       leveLevel();
    }


    public static void leveLevel(){

        Level level = Level.LOW;

        switch (level) {
            case LOW:
                System.out.println("Not sufficient");
                break;
            case MEDIUM:
                System.out.println("Satisfactory");
                break;
            case HIGH:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Unknown level");
        }

    }

}
