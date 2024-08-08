import java.util.Objects;
import java.util.Scanner;

public class TemperatureConvertor {

    public static void main(String[] args) {
/*
        Am adaugat textul acesta pentru review
 */
        Scanner reader = new Scanner(System.in);
        System.out.println("What conversion output do you choose? 'C' for Celsius and 'F' for Fahrenheit ");
        String convertTo = reader.nextLine();
        System.out.println("Enter the temperature: ");
        int newTemp = reader.nextInt();

        if (Objects.equals(convertTo, "C")) {
            int outPutC = (newTemp - 32) * 5/9;
            System.out.println("The converted temperature is: " + outPutC + " degree Celsius!");
        } else if (Objects.equals(convertTo, "F")) {
            int outPutF = (newTemp * 9/5) + 32;
            System.out.println("The converted temperature is: " + outPutF + " degree Fahrenheit!");
        } else {
            System.out.println("You did not enter a valid conversion option!");
        }
    }
}
