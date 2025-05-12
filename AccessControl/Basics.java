package Oops.AccessControl;

class A {
    protected int num;   // since it's proteted it can be accessed with in the same class, same package 
    // protected can't be accessed only when the package is different and the class is not a subclass
    String Name;
    int[] arr;

    public A(int N, String nam) {
        this.num = N;
        this.Name = nam;
        this.arr = new int[num];
    }

    public void setNum(int num) { // since we can't access num directly by creating the object of A class , we can
                                  // use get and set methods
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }

}

public class Basics {
    int num;
    public static void main(String[] args) {
        A obj = new A(8, "karan");
        // obj.num; since the num attribute is declared as private we're not able to
        // access it directly , but indirectly we can access it using getters and
        // setters method
        obj.setNum(10);
        System.out.println(obj.getNum());
        System.out.println(obj.num);
    }
}
