package Oops.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();  // the car will have methods of Car() but it have only access to the ones present in Car
        Media car1=new Car();  // the car will have methods of Car() but it have only access to the ones present in Car

        car.start();
        car.acc();
        car.brake();
        
        car1.start();
        // car1.acc(); car1 have no access to the acc method as the reference type belongs to Media type...

        // since we have start and stop in both engine and media interface and we're overriding it in Car class so if we create a refernce type of Media and the object of Car() type and then we call the start and stop function , althought the instance will've access to start() and stop() of the media one but it's being overriden in Car() class so it will be the one which is called

        
    }
}
