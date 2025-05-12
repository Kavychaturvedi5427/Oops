package Oops.Singleton;

public class TestForSingleton {
    public static void main(String[] args) {
        // Singleton s=new Singleton();     when the singleton constructor is public then it can be used anywhere but when it is private it can't be used here

        Singleton s=Singleton.getinstance();
        Singleton s1=Singleton.getinstance();
        System.out.println(s1);
        System.out.println(s);
        s.Display_name();
    }
}
