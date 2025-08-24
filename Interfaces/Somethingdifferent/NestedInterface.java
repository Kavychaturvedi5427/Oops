package Oops.Interfaces.Somethingdifferent;

public class NestedInterface {
    public interface InnerNestedInterface {      // this can have any type of modifiers but the top level one has to be public or default one
        default boolean checkevenorOdd(int num){
            if((num&1)==num){
                return false;
            }
            return true;
        }
    }
}

class Check implements NestedInterface.InnerNestedInterface{
    
}
