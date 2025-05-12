package Oops;

public class Wrapperclass {

    static void swap(Integer a,Integer b){
        Integer tem=a;
        a=b;
        b=tem;
    }

    public static void main(String[] args) {
        Integer a=10;
        Integer b=20;
        swap(a,b);          // it still won't swap 
        System.out.println(a+" "+b);    

    }
}
