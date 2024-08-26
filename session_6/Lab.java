package session_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Lab {
    public static void main(String[] args) {
        //Java.lang. Conține clase fundamentale care sunt importate automat în toate programele Java. Include clase precum Object, String, StringBuilder, System, Math
        // și clasele wrapper pentru tipurile primitive (de exemplu, Integer, Double etc.).
//        stringToMath();
//        List();
//        javIoM();
        localDatTime();
    }


    public static void stringToMath(){
        String greeting = "Hello, World!";
        int length = greeting.length();
        double squareRoot = Math.sqrt(25);

        System.out.println("Mesajul: " + greeting);
        System.out.println("Lungimea mesajului: " + length);
        System.out.println("Rădăcina pătrată a lui 25: " + squareRoot);
    }

    public static void List(){
        List<String> fruits = new ArrayList<>();
        fruits.add("Măr");
        fruits.add("Banana");
        fruits.add("Portocală");

        Random random = new Random();
        int randomIndex = random.nextInt(fruits.size());
        String randomFruit = fruits.get(randomIndex);

        System.out.println("Fructul ales aleatoriu: " + randomFruit);
    }

    public static void javIoM(){
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void localDatTime(){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Data curentă: " + date);
        System.out.println("Ora curentă: " + time);
        System.out.println("Data și ora curente: " + dateTime);
    }



}



