package Drinks.BaseClasses;

public abstract class DrinkBase {
    private String type = null;
    private String recipe = null;

    public DrinkBase(String type, String recipe) {
        setType(type);
        setRecipe(recipe);
    }

    public String getType(){
        return type;
    }

    protected void setType(String type){
        this.type = type;
    }

    public String getRecipe(){
        return recipe;
    }

    protected void setRecipe(String recipe){
        this.recipe = recipe;
    }
}
