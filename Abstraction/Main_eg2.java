package Oops.Abstraction;

public class Main_eg2 {
    public static void main(String[] args) {
        Son_eg2 s=new Son_eg2(20);
        s.Career();
        s.partner();

        Daughter_eg2 d=new Daughter_eg2(21);
        d.Career();
        d.partner();

        System.out.println(s.age+" "+d.age);

        // Parent_Eg2 parent1=new Parent_Eg2();   we can't create the object of parent class 
    }
}
