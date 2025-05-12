package Oops.Abstraction;

public class Daughter_eg2 extends Parent_Eg2{

    public Daughter_eg2(int age) {
        super(age);
    }

    @Override
    void Career() {
        // TODO Auto-generated method stub
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        // TODO Auto-generated method stub
        System.out.println("I am not going to get married until I have a stability in my career");
    }
    
}
