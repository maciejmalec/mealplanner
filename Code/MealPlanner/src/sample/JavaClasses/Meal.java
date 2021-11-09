package sample.JavaClasses;

import java.util.ArrayList;

/**
 * Class containing different ingredients of a meal used to create a meal plan
 */
public class Meal {

    private String name;
    private MealIngredient[] ingredients;
    private double calories;
    private double protein;
    private double carbs;
    private double fats;
    private MealType type;

    /**
     * Constructor of the Meal class
     */
    public Meal(String name, MealType type, Ingredient[] ingredients, double[] amounts) {
        this.name = name;
        this.ingredients = new MealIngredient[ingredients.length];
        this.type = type;


        for(int i=0; i<amounts.length; i++){
            this.ingredients[i] = new MealIngredient(ingredients[i].getName(), amounts[i]);
        }

        for(int i=0; i<ingredients.length; i++){
            calories += ingredients[i].getCalories() * amounts[i]/100;
            protein += ingredients[i].getProtein() * amounts[i]/100;
            carbs += ingredients[i].getCarbs() * amounts[i]/100;
            fats += ingredients[i].getFats() * amounts[i]/100;
        }

    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFats() {
        return fats;
    }

    public MealType getType() {
        return type;
    }

    /**
     * Method that returns the array that holds ingredient names and their amount in the meal
     * @return
     */
    public MealIngredient[] getIngredients() {
        return ingredients;
    }
}
