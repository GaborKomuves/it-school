package session_3;

public class Ternary {
    public static void main(String[] args) {
//        int number = 6;
//        String evenOrOdd = (number % 2 == 0)? "Even" : "Odd";
//        System.out.println(evenOrOdd);


        int age = 16;
        String message = (age >- 18)? "Adult": (age >+ 13)? "Teenager": "Child";
        System.out.println(message);

    }
}
