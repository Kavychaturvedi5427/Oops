package Oops;

public class forImporting {
    public static void main(String[] args) {
        
    }
    public static void message(){
        System.out.println("This class is for importing puprose.");
    }
}

class Human{
    String Name;
    int salary;
    boolean married;
    static long population=0;

    Human(String n,int sal,boolean val){
        this.Name=n;
        this.salary=sal;
        this.married=val;
        // this.population+=1;
        // since it is static we don't need to use object to access it instead we'll use class name ...
        Human.population+=1;
    }
}
