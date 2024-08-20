package challenge_04;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        /*
        1. Write a Java program where you create two String objects named
        stringOne and stringTwo with the same value "OpenAI". Check and print
        whether they refer to the same object
         */

//        String stringOne = new String("Open AI");
//        String stringTwo = new String("Open AI");
//
//        String x = (stringOne.equals(stringTwo))? ("Are equals"):("Are not equals");
//        System.out.println("Checking with method-equals show tha 2 Strings " + x);
//        String y = (stringOne == stringTwo)? ("Are equals"):("Are not equals");
//        System.out.println("Checking with operator '==' show that 2 Strings " + y);


        /*
        2. Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator to
        compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value, but use
        the equals() method for comparison. Print the result
         */
//
//        int firstNumber = 20;
//        int secondNumber = 20;
//
//        if (firstNumber == secondNumber) {
//            System.out.println("The integers are equal.");
//        } else {
//            System.out.println("The integers are not equal.");
//        }
//
//        String firstString = "Hello, IT - School team";
//        String secondString = "Hello, Java Engineers";
//
//
//        if (firstString.equals(secondString)) {
//            System.out.println("The Strings are equal!");
//        } else {
//            System.out.println("The Strings are not equal!");
//        }


        /*
        3. Write a Java program that declares an integer variable age with a value of 20.
        Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".
        */
//        int age = 20;
//        int adultAge = 18;
//        if (age >= adultAge) {
//            System.out.println("I am adult!");
//        }
//        else {
//            System.out.println("I am not an adult!");
//        }



        /*
        4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
        Use a ternary operator to determine the greater height and assign it to a variable maximumHeight.
        Print the result.
        */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the heightOne value");
//        int heightOne = sc.nextInt();
//        System.out.println("Enter the heightTwo");
//        int heightTwo =sc.nextInt();
//        sc.close();
//
//        int maximumHeight = (heightOne > heightTwo)?heightOne:heightTwo;
//        System.out.println("The greater value is : " + maximumHeight + " units");


        /*
        5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program
        to print only the even numbers
        */

//        for (int x = 1; x <= 10; x++ ){
//            System.out.println(x);
//        }

        /*
        6. Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the temperature is more than
        30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
        */

//        Scanner screader = new Scanner(System.in);
//        System.out.println("Enter de temperature!");
//        int temperature = screader.nextInt();
//        System.out.println("You entered " + temperature + "!");
//        if (temperature > 30) {
//            System.out.println("Hot");
//        } else if (temperature >= 20) {
//            System.out.println("Warm");
//        } else {
//            System.out.println("Cold");
//        }
//        screader.close();

        /*
        7. Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to
        represent the sides of the triangle. Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or
        "Scalene".
        */

//        int sideOne = 5;
//        int sideTwo = 5;
//        int sideThree = 5;
//
//
//        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" :
//                (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isosceles" :
//                        "Scalene";
//        System.out.println("The triangle is " + triangleType);
        /*
        8. Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it. Then
        calculate and print the factorial of number.
         */
//        int number = 5;
//        int factorial = 1;
//
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//        System.out.println("The factorial of " + number + " is " + factorial);


        /*
        9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA". Check if
        countryOne and countryTwo are equal using the equals() method and print the result. Then change the value of countryTwo to "UK" and check
        for equality again. Print the result.
         */

//        String countryOne = "USA";
//        String countryTwo = "USA";
//
//        boolean isEqual = countryOne.equals(countryTwo);
//        System.out.println("Are countryOne and countryTwo equal? " + isEqual);
//
//        countryTwo = "UK";
//
//        isEqual = countryOne.equals(countryTwo);
//        System.out.println("Are countryOne and countryTwo equal after changing countryTwo? " + isEqual);

        /*
        10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements to listOne and assign listOne to
        listTwo. Now modify listOne by adding a new element. Print both lists and observe the output.
         */

//        ArrayList<String> listOne = new ArrayList<>();
//        listOne.add("Apple");
//        listOne.add("Banana");
//        listOne.add("Cherry");
//        ArrayList<String> listTwo = listOne;
//
//
//        listOne.add("Date");
//        System.out.println("List One: " + listOne);
//        System.out.println("List Two: " + listTwo);



        /*
        11. Write a Java program where you declare four integer variables: a, b, c, and d. Assign them values of 10, 20, 30, and 40 respectively. Create
        two more variables additionResult and multiplicationResult. Set additionResult to the sum of a and b and multiplicationResult to the product of
        c and d. Print the values of additionResult and multiplicationResult.
        */

//        int a,b,c,d;
//        a = 10; b = 20; c = 30; d = 40;
//
//        int additionResult = a + b;
//        int amultiplicationResult = c * d;
//
//        System.out.println("The sum result is equal to " + additionResult);
//        System.out.println("The product of multiplication is equal to " + amultiplicationResult);

        /*
        12. Write a Java program where you declare an integer variable number with a value of 25. Use unary minus operator to change the sign of
        number and assign it to a variable negativeNumber. Print the values of number and negativeNumber.
        */

//        int myNumber = 25;
//        int negativeNumber = -myNumber;
//        System.out.println("The negative value of 'myNumber' is: " + negativeNumber);

        /*
        13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively. Use the
        logical complement operator to negate the values of both variables and print the new values.
         */
//        boolean isRaining = true;
//        boolean isSunny = false;
//
//        boolean isNotRaining = !isRaining;
//        boolean isNotSunny = !isSunny;
//
//        System.out.println("The boolean - isRaining ("+ isRaining +") with negation become:  " + isNotRaining);
//        System.out.println("The boolean - isSunny ("+ isSunny +") with negation become:  " + isNotSunny);


        /*
        14. Write a Java program where you declare an integer variable counter with a value of 0. Use the increment operator to increase the value of
        counter by 1 and then print the value. After that, use the decrement operator to decrease the value of counter by 1 and then print the value.
         */

//        int counter =0;
//
//        counter++;
//        System.out.println("Counter after increment of it: " + counter);
//
//        counter--;
//        System.out.println("Counter after decrement of it: " + counter);



        /*
        15. Write a Java program where you declare an integer variable total with a value of 100. Use the compound assignment operator to decrease
        the total by 20 and then print the value. Next, use another compound assignment operator to multiply the total by 2 and then print the value.
        */
//
//        int myInt = 100;
//        myInt += 20;
//        System.out.println("The addition result is equals to " + myInt);
//
//        myInt *= 2;
//        System.out.println("The product result is equals to " +myInt);



        /*

        16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50.
        First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step
         */
//
//        int myValue = 50;
//         myValue = -myValue;
//        System.out.println("The negative value of 'myValue' is: "+ myValue);
//
//        myValue = Math.abs(myValue);
//        System.out.println("The absolute value of 'myValue' is: "+ myValue);
//
//        myValue++;
//        System.out.println("The incremented value of 'myValue' is: "+ myValue);

        /*
        17. Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername and hasPassword. Set up a
        series of logical conditions using these two variables that will check the following conditions:
        ● If both hasUsername and hasPassword are true, print "Authentication successful".
        ● If either hasUsername or hasPassword is false, print "Authentication failed".
        ● If hasUsername is true but hasPassword is false, print "Password is incorrect".
          */
//        boolean hasUserName = true;
//        boolean hasUserPassword =  false;
//
//        if (hasUserName == true && hasUserPassword == true){
//            System.out.println("Auth entication successful");
//        } else if (hasUserName == false || hasUserPassword == false) {
//            System.out.println("Authentication failed");
//        } else {
//            System.out.println("Password is incorrect");
//        }


          /*
        18. Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize the array such that each element is
        equal to its index incremented by 1. Then use another for loop to decrement each element by 1. Print the array before and after the
        decrement operation using a for-each loop.
          */

//        int [] array = new int[5];
//
//        for (int i = 0; i < array.length; i++){
//            array[i] = i + 1;
//        }
//
//        System.out.println("The array 'array' after increment operation:");
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] -= 1;
//        }
//        System.out.println("The array named 'array' after decrement operation ");
//        for (int value : array){
//            System.out.print(value + " ");
//        }


         /*
        19. Write a Java program that takes an integer variable age as input. Use a ternary operator to classify the person into one of the following
        categories: "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above). Print
        the resulting classification.
          */

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.close();
//
//
//        String category = (age < 12) ? "Child" : (age >= 12 && age <= 17) ? "Teenager" : (age >= 18 && age <= 64) ? "Adult" : "Senior";
//
//        System.out.println("You are classified as: " + category);


         /*
        20. Write a Java program that takes three integer variables a, b, and c as input. Use nested ternary operators to find and print the largest
        number among the three
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter the third number (c): ");
        int c = sc.nextInt();
        sc.close();

        int largest = (a >= b) ? (Math.max(a, c)) : (Math.max(b, c));

        System.out.println("The largest number is: " + largest);



    }
}
