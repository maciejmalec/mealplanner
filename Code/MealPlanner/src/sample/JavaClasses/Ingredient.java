package sample.JavaClasses;

/**
 * Class containing name and nutritional values of ingredient
 * Used instead of Food class for readability reasons
 * Extends Food class
 */
public class Ingredient extends Food{
    public Ingredient(String name, float calories, float protein, float carbs, float fats) {
        super(name, calories, protein, carbs, fats);
    }
}
