package challenge_13.car;

class Limo extends Car{
    @Override
    public void start(){
        System.out.println("Limo porneste");
    }


    public void horn(){
        System.out.println("Limo claxoneaza urat ....");
    }

    public void stop() {
        System.out.println("Limo opreste la stop ");
    }
}
