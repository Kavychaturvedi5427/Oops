package Oops.Singleton;

import java.util.Scanner;

public class Singleton {
    String name;
    Scanner scan=new Scanner(System.in);
    private Singleton(){        // this can be used only within this class ..
        System.out.println("Enter the name::");
        this.name=scan.nextLine();
    }

    private static Singleton instance;
    
    public void Display_name(){
        System.out.println("The name of the user is ::"+this.name);
    }

    public static Singleton getinstance(){
        if(instance == null){
            instance=new Singleton();
        }
        return instance;
    }
}
