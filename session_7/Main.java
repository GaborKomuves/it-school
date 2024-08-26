package session_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        demonstrateDateTimeOperation();
//        demonstrateRandomNumberGenerator();
        readFromFileWithScanner();
    }

//    private static void demonstrateRandomNumberGenerator() {
//        System.out.println("=== Random Number Generator ===");
//
//        // Creăm un obiect Random
//        Random random = new Random();
//
//        // Generăm un număr aleatoriu între 1 și 100
//        int randomInt = random.nextInt(100) + 1;  // +1 pentru a schimba intervalul de la [0, 99] la [1, 100]
//        System.out.println("Random int: " + randomInt);
//
//        // Generăm un număr aleatoriu între 0 și 1 (exclusiv 1)
//        double randomDouble = random.nextDouble();
//        System.out.println("Random double: " + randomDouble);
//
//        // Generăm un număr aleatoriu în intervalul specificat
//        int min = 50;
//        int max = 150;
//        int randomIntInRange = random.nextInt((max - min) + 1) + min;
//        System.out.println("Random int in range [50, 150]: " + randomIntInRange);
//
//        // Generăm un boolean aleatoriu
//        boolean randomBoolean = random.nextBoolean();
//        System.out.println("Random boolean: " + randomBoolean);
//    }

    private static void demonstrateDateTimeOperation(){
        System.out.println("=== Date and Time Operations ===");

        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalDate tenDaysLater = today.plusDays(10);
        System.out.println("Date after 10 days: " + tenDaysLater);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        LocalDateTime futureDateTime = currentDateTime.plusHours(5).plusMinutes(30);
        System.out.println("5 hours and 30 minutes later: " + futureDateTime);

        // Calculating a specific date and time in the future
        LocalDateTime futureDate = LocalDateTime.of(2025, 1, 1, 10, 30);
        String result = futureDate.isBefore(LocalDateTime.now()) ? "before" : "after";
        System.out.println("Future date " + futureDate + " is " + result + " current date time");

        // Parsing a date and time string
        String dateTimeString = "2023-01-01 10:30";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println("Parsed local date time: " + parsedDateTime);

        // Formatting the parsed date time to a new format
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
        System.out.println("New format date time: " + parsedDateTime.format(newFormat));

        // Additional Operation: Adding days, months, and years
        LocalDateTime addedTime = parsedDateTime.plusYears(1).plusMonths(2).plusDays(15);
        System.out.println("Date after adding 1 year, 2 months, and 15 days: " + addedTime);

        // Additional Operation: Subtracting time
        LocalDateTime subtractedTime = parsedDateTime.minusHours(5).minusMinutes(30);
        System.out.println("Date after subtracting 5 hours and 30 minutes: " + subtractedTime);


        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        System.out.println("Java.util.Date: " + utilDate);
        System.out.println("Java.sql.Date: " + sqlDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM:mm:ss");
        String formattedTime = simpleDateFormat.format(utilDate);
        System.out.println("Formatted time is " + formattedTime);


        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Curent timestamp is : " + currentTimeStamp);

        Timestamp timestamp1 = Timestamp.valueOf("2024-08-26 17:56:06.741");
        Timestamp timestamp2 = Timestamp.valueOf("2024-08-26 17:59:06.741");

//        long differentSeconds = (timestamp2.getTime())
    }

    private static void readFromFileWithScanner() {
        try {
            Scanner scanner = new Scanner(new File("example.txt"));

            while (scanner.hasNextLine()) {
                System.out.println("TEXT: " + scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!!!");
        }
    }
}
