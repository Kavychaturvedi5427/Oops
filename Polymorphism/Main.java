package Oops.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        shape.area();

        Square sq=new Square();
        sq.area();

        Triangle tri=new Triangle();
        tri.area();

        Shapes sh=new Square();     // here we're creating the object of square type but we're storing it in the Shape reference type and when we try to run it instead of calling the area() method of reference type it will call the area() method of object type ---> this is called Dynamic Polymorphism.....

        // same function in parent and child class then in such case method overriding is done...
    
    
        sh.area();
    }
}