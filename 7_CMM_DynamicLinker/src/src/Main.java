package src;

import src.CMM.CMM_OpenAPI;
import src.CMM.CoffeeMakingMachine;

public class Main {

    public static void main(String[] args) {
        CMM_OpenAPI myCoffeeMaker = new CoffeeMakingMachine();
        myCoffeeMaker.setCoffeeType("regular");
        myCoffeeMaker.setCoffeeType("mocha with 2 chocolate and extra cream and 3 vanilla");
        myCoffeeMaker.setCoffeeType("mocha with chocolate");
        myCoffeeMaker.setCoffeeType("espresso with 2 chocolate");
    }
}
