package challenge_03;

public class Main {
    public static void main(String[] args) {

        /*
        1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
        */
//        int a = 5, b = 10;
//        int add = a + b;
//        int sub = b - a;
//        int multiply = a * b;
//        int div = b / a;
//        System.out.println("Addition result = " + add);
//        System.out.println("Subtraction result = " + sub);
//        System.out.println("Multiply result = " + multiply);
//        System.out.println("Division result = " + div);



        /*
        2. Create a Java program where you increment and decrement the same variable.
        Display the value of the variable after each operation.
//        */
//        int x = 6;
//        x--;
//        System.out.println("x-- is = " + x);//x = 6 apoi decrementeaza la 5
//        --x;
//        System.out.println("--x is = " + x);//x este 5 se decrementeaza direct la 4
//         x++;
//        System.out.println("x++ is = " + x);// x este 4 si se incrementeaza la 5
//        ++x;
//        System.out.println("++x is = " + x);// x este deja 5 insa se incrementeza direct la 6


        /*
        3. Write a program to check if a number is positive or negative using logical
        complement operator.
        */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int nr = sc.nextInt();
//        sc.close();
//
//        if (nr < 0){
//            System.out.println("The number "+ nr + " is negative!");
//        } else if (nr == 0) {
//            System.out.println("The number "+ nr + " is zero!");
//        } else if (nr > 0) {
//            System.out.println("The number "+ nr + " is positive!");
//        } else {
//            System.out.println("The number "+ nr + " is not valid!");
//        }


        /*
        4. Write a Java program that uses both the increment (++) and decrement (--)
        operators in a loop to count up to 10 and then back down to 1.
        */

//        for (int i = 0; i < 11; i++) {
//            System.out.println("Count up " + i);
//        }
//
//        for (int j = 10; j >=1; j--) {
//            System.out.println("Count down " + j);
//        }



        /*
        5. Create a Java program that demonstrates the use of each compound assignment
         operator with integers.
        */
//        int A = 5;
//        A += 2;//A = A + 2
//        System.out.println("Addition of A + 2  = " + A);
//        A -= 1;// A =A -1
//        System.out.println("Subtraction of A - 1  = " + A);
//        A *= 2;//A = A * 2
//        System.out.println("Addition of A * 2  = " + A);
//        A /= 2;//A = A / 2
//        System.out.println("Addition of A / 2  = " + A);



        /*
        6. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater
        than, less than, or equal to the second number.
        */
//
//        Scanner read = new Scanner(System.in);
//        System.out.println("Enter first number:");
//        int A = read.nextInt();
//        System.out.println("Enter second number:");
//        int B = read.nextInt();
//        read.close();
//
//        if (A>B) {
//            System.out.println("First is greater than second");
//        } else if (A==B) {
//            System.out.println("First number is equal to second one!");
//        } else if (A<B) {
//            System.out.println("First is smaller than second");
//        } else {
//            System.out.println("You did not entered any numbers, please do it!");
//        }

        /*
        7. Write a program where you perform operations between an integer and
        a double. Display the result.
        */

//        int intValue = 10;
//        double doubleValue = 4.00;
//
//        double sum = intValue + doubleValue;
//        double sub = intValue - doubleValue;
//        double mul = intValue * doubleValue;
//        double div = intValue / doubleValue;
//
//        System.out.println("The integer value is: " + intValue);
//        System.out.println("The double value is: " + doubleValue);
//        System.out.println("The sum is a double result: " + sum);
//        System.out.println("The subtraction= is a double result: " + sub);
//        System.out.println("The multiplication is a double result: " + mul);
//        System.out.println("The division is a double result: " + div);

        /*
        8. Create a program that takes two byte values, adds them together,
        and stores the result in a byte variable.
        */

//        byte byteVal1 = 100;
//        byte byteVal2 = 20;
//
//        byte byteSum =(byte) (byteVal1 + byteVal2);
//
//        System.out.println("Byte value 1 is = " + byteVal1);
//        System.out.println("Byte value 2 is = " + byteVal2);
//        System.out.println("Sum pf two byte values is equal to  = " + byteSum);



        /*
        9. Write a program that calculates the area of a rectangle.
        Take the length and breadth as inputs.
         */

//        int rectLength = 100;
//        int rectBreadth = 50;
//        int rectArea = rectBreadth ^ rectLength;
//
//        System.out.println("The rectangle area is equal to = " + rectArea);


         /*
        10. Write a program that reverses the sign of an entered integer
        using unary minus operator.
          */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the integer!");
//        int intVal = scanner.nextInt();
//        scanner.close();
//
//        int reversInteger = -intVal;
//        System.out.println("Original integer is = " + intVal);
//        System.out.println("The reversed integer is = " + reversInteger);

          /*
        11. Write a Java program that takes two boolean inputs from a user.
        Apply the logical negation operator (!) to each and print the result.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the boolean value");
//        boolean booleanOne = sc.nextBoolean();
//        System.out.println("Enter the second boolean value");
//        boolean booleanTwo = sc.nextBoolean();
//
//        boolean booleanNegativeOne = !booleanOne;
//        boolean booleanNegativeTwo = !booleanTwo;
//
//        System.out.println("The negation of First boolean value is ("+ booleanOne + ")" + booleanNegativeOne + "!");
//        System.out.println("The negation of Second boolean value is ("+ booleanTwo + ")" + booleanNegativeTwo + "!");
//
//        sc.close();

        /*
        12. Create a program that takes an integer as input and then increments and
        decrements it by 1,displaying the output at each stage.
        */

//        int myInt = 10;
//        System.out.println("Value of integer is " + myInt);
//        myInt++;
//        System.out.println("Value of integer is read and after incremented with one " + myInt);
//        ++myInt;
//        System.out.println("Value of integer is read and incremented with one " + myInt);
//
//        myInt--;
//        System.out.println("Value of integer is read and after decremented with one " + myInt);
//        --myInt;
//        System.out.println("Value of integer is read and incremented with one " + myInt);



        /*
        13. Write a program to calculate the price after
        discount. Take the original price and
        discount percentage as input. Use compound assignment
        operator to perform the calculation.
        */
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter the original price, please!");
//        double originalPrice = reader.nextDouble();
//
//        System.out.println("Enter the discount percentage: ");
//        double discountPercentage = reader.nextDouble();
//
//        originalPrice -= originalPrice * (discountPercentage / 100);
//        System.out.println("The price after discount is: " + originalPrice);
//
//        reader.close();



        /*
        14. Create a program that checks if a user entered number
        is within a specific range
        (e.g., 1-100). Use relational operators for the checks.
         */

//        int lowLimit = 1;
//        int highLimit = 100;
//
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter the integer number ");
//        int myNumber = reader.nextInt();
//
//        if (myNumber >= lowLimit && myNumber <= highLimit) {
//            System.out.println("The integer number ("+ myNumber+") is in the 1-100 range!");
//        } else {
//            System.out.println("The integer number ("+ myNumber+") is not in the 1-100 range!");
//        }
//
//        reader.close();

    }
}
