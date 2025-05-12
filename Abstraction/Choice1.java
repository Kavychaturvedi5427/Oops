package Oops.Abstraction;

import java.util.Scanner;

public class Choice1 extends Carchoice{
    Scanner scan =new Scanner(System.in);

    @Override
    void EnterChoice(String Name) {
        // TODO Auto-generated method stub
        System.out.println("The person1 is planning to buy car of "+Name+"brand");
        
    }
    @Override
    void EnterBudgetAndtype(String Type, int budget) {
        // TODO Auto-generated method stub
        System.out.printf("And in that brand he is looking a vehicle of %s type under the budget of %d.",Type,budget);
        
    }

    public static void main(String[] args) {
    }
}
