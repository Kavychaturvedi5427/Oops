package Oops;

public class Static {
    public static void main(String[] args) {
        Human person1=new Human("Naman", 100000, true);
        Human person2= new Human("Karan", 123000, false);
        
        // if the variable is not static then the values get changed for each object 
        
        System.out.println(person1.population);
        System.out.println(person2.population);
        // what if we want some properties of Human class to be same for all the objects..... 

        
    }
}
