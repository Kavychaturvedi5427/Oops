package Oops.Inheritance;

public class BoxWeight extends BoxExample {
    double weight;

    public BoxWeight() {
        this.weight = -1;
        // this.l=_____; if it's declared as private we'll not be able to access it here
    }

    public BoxWeight(double height, double length, double width, double Weight) {
        super(length, height, width); // used to initialize the values in the parent class constructor
        // if the variable is private then there's a question that how in the above line
        // we're able to access it --> it's because the BoxWeigth class is not accessing
        // it , it's the BoxExample that is accessing it ....
        this.weight = Weight;
    }

    public BoxWeight(BoxWeight other) {
        // this constructor is similar to BoxExample box2= new BoxWeigth().....

        super(other); // here we're passing the refernce of BoxWeight type but in the parent class
                      // we're receiving the BoxExample type variable
        // this means that the constructor in BoxExample which is receiving the
        // constructor as input will have the BoxExample type even though we've passed a
        // reference of BoxWeight type but still it's the reference type variable that
        // determines the accessiblity of the content
        this.weight = other.weight;
    }
}
