package Oops.Abstraction;

public class Choice2 extends Carchoice {

    @Override
    void EnterChoice(String Name) {
        // TODO Auto-generated method stub
        System.out.println();
        System.out.println("The person2 has shown his interest in buying the watch of "+Name+" brand");
    }

    @Override
    void EnterBudgetAndtype(String Type, int budget) {
        // TODO Auto-generated method stub
        System.out.printf("In that brand he likes %s type of watches with in the budget range of %d. ",Type,budget);
    }
}


