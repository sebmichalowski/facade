package Drinks;

import Drinks.BaseClasses.DrinkBase;

public class Mojito extends DrinkBase implements Drink {

    public Mojito(String type, String recipe) {
        super(type, recipe);
    }

    public void make() {
        System.out.println("Recipe: " + getRecipe());
        System.out.println("Make " + getType() + " drink");
    }
}
