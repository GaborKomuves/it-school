package session_3;

public class Increment {

    public static void main(String[] args) {
//        int counter = 0;
//        System.out.println(counter);
//        System.out.println(++counter);
//        System.out.println(counter);
//        System.out.println(counter++);
//        System.out.println(counter--);
//        System.out.println(counter);

//        int value = 5;//valoarea este incrementatta imediat si devine 6
//        int result = ++value;// rezultaul primeste valoarea 6
//        System.out.println(result);
//
//        int value1 = 5;
//        int result1 = value1++;
//        System.out.println(value1);

//        int value = 5;
//        int result = --value;
//        System.out.println(result);
//
//        int value1 = 5;
//        int result1 = value1--;
//        System.out.println(value1);

        int x = 3;
        int y = 4 / ++x - x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
