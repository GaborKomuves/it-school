package session_4;

public class Main {
    public static void main(String[] args) {

//        sum(5, 11);//pentru metoda sum
//
//        Main main = new Main();// pentru metoda sum 2
//        int x = main.sum2(3, 6);// pentru metoda sum 2
//        System.out.println("Sum2 is " + x);// pentru metoda sum 2

//        equality();
        objectEquality();
    }

    private static void objectEquality(){
        Person pers1 = new Person("Sam");
        Person pers2 = new Person("Ion");

        Person pers3 = pers1;

        System.out.println(pers1 == pers2);
        System.out.println(pers1 == pers3);

    }

    private static void equality() {
        int a = 5;
        int b = 10;
        System.out.println(a == b);//false
        System.out.println(a != b);//true
    }



    private static void sum(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }

    public int sum2(int a, int b) {
        return a + b;
    }
}

class Person{
    String name;

    Person(String name){
        this.name = name;
    }
}
