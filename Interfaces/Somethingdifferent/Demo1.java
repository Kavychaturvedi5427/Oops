package Oops.Interfaces.Somethingdifferent;

public interface Demo1 extends Demo2 {
    default void fun() {
        System.out.println("This is the defualt code which will be executed if the method is not overrriden");
    }

    void greet();
}