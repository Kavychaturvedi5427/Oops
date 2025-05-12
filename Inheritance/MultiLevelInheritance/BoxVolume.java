package Oops.Inheritance.MultiLevelInheritance;

public class BoxVolume extends BoxDimension {
    double volume;

    BoxVolume() {
        this.volume = -1;
        System.out.println("The volume of the box is --> " + this.volume);
    }

    BoxVolume(double len, double wid, double hei) {
        super(len, wid, hei);
        this.volume = this.height * this.length * this.width;
        System.out.println("The volume of the box is -->" + this.volume);
    }
}
