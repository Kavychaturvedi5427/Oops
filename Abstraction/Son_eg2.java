package Oops.Abstraction;

public class Son_eg2 extends Parent_Eg2 {

    public Son_eg2(int age) {
        super(age);
    }

    @Override
    void Career() {
        // TODO Auto-generated method stub
        System.out.println("I am going to be a Coder");
    }

    @Override
    void partner() {
        // TODO Auto-generated method stub
        System.out.println("I am going to spend my life with someone just like me.");
    }

    public static void main(String[] args) {
        hello();    // static method of the parent class.
    }

}
