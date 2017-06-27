import Drinks.Drink;
import Drinks.Mojito;
import Drinks.SexOnTheBEach;

public class MakeDrinks {
    private Drink mojito;
    private Drink sexOnTheBeach;

    public MakeDrinks() {
        this.mojito = new Mojito("Mojito", "Mojito Recipe");
        this.sexOnTheBeach = new SexOnTheBEach("Sex on the Beach", "Sex on the Beach recipe");
    }

    public void makeMojito(){
        mojito.make();
    }

    public void makeSexOnTheBeach(){
        sexOnTheBeach.make();
    }
}
