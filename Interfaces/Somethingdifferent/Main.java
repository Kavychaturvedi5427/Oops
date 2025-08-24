package Oops.Interfaces.Somethingdifferent;

public class Main  {

    // @Override
    // public void greet() {
    //     // TODO Auto-generated method stub
    // }
    // // the code isn't giving error for fun() because there is a default one
    // // available for it , that will be executed even if we don't override it
    public static void main(String[] args) {
        Check che=new Check();
        System.out.println(che.checkevenorOdd(2));
    }
}
