package Oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        // BoxExample box1=new BoxExample(3);
        // BoxExample box2=new BoxExample(box1);
        // System.out.println(box2.h+" "+box2.l+" "+box2.w);

        BoxWeight box = new BoxWeight();
        BoxWeight box2 = new BoxWeight(2, 3, 5, 6);
        System.out.println(box2.l + " " + box2.h + " " + box2.w + " " + box2.weight); // if the varibale l in BoxExample
                                                                                      // class is declaread as private
                                                                                      // we'll not be able to access it
                                                                                      // here

        BoxExample box3 = new BoxWeight(2, 3, 5, 6); // taking reference of parent class and creating object of child class
        // System.out.println(box3.weight); we're still not able to access content of
        // child class --> Because it's the type of refernce variable that determines
        // what members can be accessed....

        // but if we try to create a reference variable of child class and create an
        // object of parent class then

        // BoxWeight box4=new BoxExample(2,3,5); this will generate an error because the
        // reference being of BoxWeight class we'll be able to initialize weight
        // variable but the object is of Parent class i.e BoxExample which has no idea
        // about the weight variable.....

    }
}
