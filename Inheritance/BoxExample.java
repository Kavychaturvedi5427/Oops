package Oops.Inheritance;

public class BoxExample {
    // private double l; here it's declared as private we'll not be able to access
    // it
    double l;    // this is for length. 
    double w;    // this is for width.
    double h;    // this is for height.

    public BoxExample() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // This is for creating the cube.....

    public BoxExample(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    public BoxExample(double len, double bread, double height) {
        this.h = height;
        this.l = len;
        this.w = bread;
    }

    public BoxExample(BoxExample old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void display() {
        System.out.println("This is a box");
    }
}
