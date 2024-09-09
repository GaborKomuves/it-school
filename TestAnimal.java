package challenge_10_AnimalApp;

public class TestAnimal {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myWolf = new Wolf();

        myDog.sound();// |Cainele latra
        myCat.sound();// Pisica miauna
        myWolf.sound();// Lupul urla
    }
}
