package Oops;

public class InnerClass {
    // class test{
    //     String a;

    //     test(String name){
    //         this.a=name;
    //     }
    // }
    static class test{
        String a;

        test(String name){
            this.a=name;
        }
    }
    public static void main(String[] args) {
        // test n=new test("naman");    we can't do this until the test class is defined under InnerClass ... If it is declared separately outside InnerClass then it will work fine 
        // but if it is made static then it will work without any error....

        test t=new test("naman");    
    }
}
