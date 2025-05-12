package Oops.Abstraction;

public abstract class Parent_Eg2 {
    int age;

    abstract void Career();

    abstract void partner();

    public Parent_Eg2(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("Hello world");
    }
}
