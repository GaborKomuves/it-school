package challenge_07;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.temporal.ChronoUnit;

import static challenge_07.challengeB07.DateAuthenticator.isValidDate;

public class challengeB07 {

    public static void main(String[] args) {
        /*
        1. Displaying Today's Date
        Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
        Expected Output: Today's date in the format YYYY-MM-DD.
         */

//        displayTodaysDate();


        /*
        2. Date Decomposition
        Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day
        components separately.
        Input: A date in the format YYYY-MM-DD.
        Expected Output:
        makefile
        Copy code
        Year: YYYY
        Month: MM
        Day: DD
         */
//        String date = "2024-09-17";
//
//        displayDateComponents(date);

        /*
        3. Create a Specific Date
        Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
        Expected Output: A date object for 2025-8-19.
         */
//        LocalDate date1 = createSpecificDate();
//
//        System.out.println("Specific Date: " + date1);

        /*
        4. Comparing User-Entered Dates
        Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false
        otherwise.
        Input: Two dates entered by the user in the format YYYY-MM-DD.
        Expected Output:
        true if both dates are equal.
        false if they are different.
         */
//        boolean result = areDatesEqual();
//        System.out.println("Are the two dates equal? " + result);

        /*
        5. Is Today a Specific Date?
        Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
        Expected Output:
        true if today's date is 2019-12-10.
        false otherwise.
         */
        boolean result1 = isTodaySpecificDate();
        System.out.println("Is today 10th December 2019? " + result1);


        /*
        6. Getting Current Time
        Description: Write a method named displayCurrentTime that prints the current time to the console.
        Expected Output: The current time in the format HH:MM:SS.
         */
//        displayCurrentTime();

        /*
        7. Date Arithmetic
        Description: Write a method named addWeeksToToday that accepts an integer as its argument. This integer denotes the number of weeks. The
        method should add this number of weeks to today's date and return the resultant date.
        Input: An integer n (e.g., 4).
        Expected Output: A date object that is n weeks from today
         */
//        int weeksToAdd = 4;
//        LocalDate futureDate = addWeeksToToday(weeksToAdd);
//
//        System.out.println("Date after adding " + weeksToAdd + " weeks: " + futureDate);

        /*
        8. Weekday Identifier
        Description: Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday,
        etc.) for that date.
        Input: A date in the format YYYY-MM-DD.
        Expected Output: The day of the week in string format (e.g., "Wednesday")
         */
//        String date = "2024-08-26";
//
//        String dayOfWeek = findDayOfWeek(date);
//
//        System.out.println("Day of the week: " + dayOfWeek);

        /*
        9. Interval Between Dates
        Description: Design a method titled daysBetween that reads two dates from the console and computes the total number of days between
        them.
        Input: Two dates given by the user in the format YYYY-MM-DD.
        Expected Output: An integer showcasing the difference in days between the two dates.
         */
//        long result = daysBetween();
//        System.out.println("The number of days between the two dates is: " + result);

        /*
        10. Date Authenticator
        Description: Engineer a method named isValidDate that captures a date string from the console and assesses if it conforms to a valid date
        format (YYYY-MM-DD). The method should also consider leap years when validating February dates.
        Input: A string of a date from the console.
        Expected Output:
        true if the input adheres to the date format and denotes a genuine date.
        false if otherwise.
         */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a date (YYYY-MM-DD): ");
//        String date = scan.nextLine();
//
//        if (isValidDate(date)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        scan.close();

    }


// 1. Displaying Today's Date
    public static void displayTodaysDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
    }



    // 2. Date Decomposition
    public static void displayDateComponents(String date) {
        LocalDate parsedDate = LocalDate.parse(date);
        int year = parsedDate.getYear();
        int month = parsedDate.getMonthValue();
        int day = parsedDate.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }


    // C3. Create a Specific Date
    public static LocalDate createSpecificDate() {
        LocalDate specificDate = LocalDate.of(2025, 8, 19);

        return specificDate;
    }


    //        4. Comparing User-Entered Dates
    public static boolean areDatesEqual() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String firstDateInput = scanner.nextLine();

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String secondDateInput = scanner.nextLine();

        LocalDate firstDate = LocalDate.parse(firstDateInput);
        LocalDate secondDate = LocalDate.parse(secondDateInput);
        return firstDate.equals(secondDate);
    }

    // 5. Is Today a Specific Date?
    public static boolean isTodaySpecificDate() {
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2019, 12, 10);
        return today.equals(specificDate);
    }


    // 6. Getting Current Time
    public static void displayCurrentTime() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);
        System.out.println("Current Time: " + formattedTime);

    }


    // 7. Date Arithmetic
    public static LocalDate addWeeksToToday(int weeks) {
        LocalDate today = LocalDate.now();
        LocalDate resultDate = today.plusWeeks(weeks);
        return resultDate;
    }


    // 8. Weekday Identifier
    public static String findDayOfWeek(String date) {
        LocalDate parsedDate = LocalDate.parse(date);
        String dayOfWeek = parsedDate.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return dayOfWeek;
    }


    //        9. Interval Between Dates
    public static long daysBetween() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String firstDateInput = scanner.nextLine();

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String secondDateInput = scanner.nextLine();

        LocalDate firstDate = LocalDate.parse(firstDateInput);
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
        return daysBetween;

    }



    // 10. Date Authenticator
    public class DateAuthenticator {
        public static boolean isValidDate(String date) {
            String[] parts = date.split("-");

            if (parts.length != 3) {
                return false;
            }

            try {
                int year = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int day = Integer.parseInt(parts[2]);

                if (month < 1 || month > 12) {
                    return false;
                }

                int[] maxDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                if (month == 2 && isLeapYear(year)) {
                    maxDaysInMonth[1] = 29; // February has 29 days in a leap year
                }

                if (day < 1 || day > maxDaysInMonth[month - 1]) {
                    return false;
                }

                return true;
            } catch (NumberFormatException e) {
                return false;
            }

        }


    }
    // 10. Date Authenticator-metoda de verificare
    public static boolean isLeapYear ( int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;

        }
    }






}