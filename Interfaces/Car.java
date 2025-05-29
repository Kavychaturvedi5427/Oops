package Oops.Interfaces;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("My function is to decrease the speed of the car.");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("My function is to turn on the car.");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("My function is to stop the car.");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("My function is to increase the speed of the car.");
    }
}
