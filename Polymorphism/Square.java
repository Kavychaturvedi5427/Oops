package Oops.Polymorphism;

public class Square extends Shapes{

    // this will be called at the run time as it is over riding the area() method of the parent class...
    @Override
    void area(){
        System.out.println("Area of square is side*side");
    }
}
