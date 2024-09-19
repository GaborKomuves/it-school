package challenge_13.car;

public class Sport extends Car{
    @Override

    public void start(){
        System.out.println("Sport pornete in tromba ");
    }

    @Override
    public void stop() {
        System.out.println("Sport opreste cu scartiit de roti");
    }
}
