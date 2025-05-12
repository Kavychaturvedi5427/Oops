package Oops.Inheritance.MultiLevelInheritance;

public class BoxDimension extends box {
    BoxDimension() {
        System.out.println("The dimensions of the box is :: > " + this.length + "," + this.width + "," + this.height);
    }

    BoxDimension(double len, double wid, double hei) {
        this.length = len;
        this.width = wid;
        this.height = hei;
        System.out.println("The dimensions of the box is :: > " + this.length + "," + this.width + "," + this.height);
    }
}
