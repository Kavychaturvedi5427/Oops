package Oops;
// import java.text.NumberFormat.Style;
import java.util.Scanner;

class StudentInfo{
    String Name;
    int rollnum;
    String Address;
    String mob;

    // StudentInfo(){  // defualt constructor which will be executed when the object is created...
    //     // this keyword will assign all these values once the object is created 
    //     // so basically "this" keyword will replace thing written below...
    //     // S1.Name = "kunal";
    //     // S1.rollnum =12;
    //     // scan.nextLine(); // consume leftover newline
    //     // S1.Address = "kanput"; // full address
    //     // S1.mob =9912124;

    //     this.Name="Naman";      
    //     this.rollnum=1;
    //     this.Address="Kanpur";
    //     this.mob="xxxxxxxxxxx";
    // }

    StudentInfo (StudentInfo other){
        this.Name=other.Name;
        this.rollnum=other.rollnum;
        this.Address=other.Address;
        this.mob=other.mob;
    }

    StudentInfo(int roll,String Name,String add,String Mobile){  

        this.Name=Name;      
        this.rollnum=roll;
        this.Address=add;
        this.mob=Mobile;
    }
}


public class Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentInfo S1 = new StudentInfo(58,"naman","V21 yashoda nagar","9912124411");  // here the constructor with three formal parameter will be called 
        // and if we write StudentInfo() without passing any values then the one with zero formal parameters will be called...
        // System.out.println("Enter the info of 1st student::");
        // StudentInfo S2 = new StudentInfo();

        // S1.Name = "kunal";
        // S1.rollnum =12;
        // scan.nextLine(); // consume leftover newline
        // S1.Address = "kanput"; // full address
        // S1.mob =9912124;

        System.out.println("The details of the first student is :: " + 
        S1.Name + " " + S1.rollnum + " " + 
        S1.Address + " " + S1.mob);
        // System.out.println("The details of the second student is :: " + 
        // random.Name + " " + random.rollnum + " " + 
        // random.Address + " " + random.mob);

        StudentInfo random=new StudentInfo(S1);   // this will automatically call default one but if the default one is not there then
        System.out.println("The details of the second student is :: " + 
        random.Name + " " + random.rollnum + " " + 
        random.Address + " " + random.mob);

        scan.close();
    }
}
