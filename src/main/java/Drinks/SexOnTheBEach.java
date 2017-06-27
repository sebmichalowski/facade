package Drinks;

import Drinks.BaseClasses.DrinkBase;

public class SexOnTheBEach extends DrinkBase implements Drink {

    public SexOnTheBEach(String type, String recipe) {
        super(type, recipe);
    }

    public void make() {
        System.out.println("Recipe: " + getRecipe());
        System.out.println("Make " + getType() + " drink");
    }
}
