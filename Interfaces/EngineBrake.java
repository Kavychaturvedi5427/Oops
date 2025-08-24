package Oops.Interfaces;

public class EngineBrake implements Brake{

    @Override
    public void brake() {
        System.out.println("Power Engine Brakes.");
    }
}
