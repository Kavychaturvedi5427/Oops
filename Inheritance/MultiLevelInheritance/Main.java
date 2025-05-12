package Oops.Inheritance.MultiLevelInheritance;

// Box (Parent Class) --> BoxDimension(child class extends to box) --> BoxVolume (child class of BoxDimension which extends to BoxDimension)


public class Main {
    public static void main(String[] args) {
        BoxVolume box1 = new BoxVolume(2, 3, 5);   
         // 1--> this will call the parameterized constructor of Boxvolume class 
         // 2--> In that parameterized constructor we'll call the super (referring to the BoxDimension class)
         // 3--> In that BoxDimension (super class to BoxVolume) from there the value which we have passed will be assigned to that object reference variable and will print that...
         // 4--> now in box volume we're calculating the volume for that variable 

    }
}
