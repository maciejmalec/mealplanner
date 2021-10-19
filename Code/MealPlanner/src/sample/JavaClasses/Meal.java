package sample.JavaClasses;

import java.util.ArrayList;

/**
 * Class containing different ingredients of a meal used to create a meal plan
 */
public class Meal extends Food {
    private ArrayList<MealIngredient> ingredients;

    /**
     * Constructor of the Meal class
     */
    public Meal(String name, float calories, float protein, float carbs, float fats, ArrayList<MealIngredient> ingredients) {
        super(name, calories, protein, carbs, fats);
        this.ingredients = ingredients;
    }

    /**
     * Method that returns the array that holds ingredient names and their amount in the meal
     * @return
     */
    public ArrayList<MealIngredient> getIngredients() {
        return ingredients;
    }
}
