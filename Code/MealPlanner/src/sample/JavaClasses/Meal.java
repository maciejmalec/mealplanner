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

    /**
     * Constructor of the Meal class
     */
    public Meal(String name, Ingredient[] ingredients, double[] amounts) {
        this.name = name;

        ArrayList<MealIngredient> temp = new ArrayList<>();
        for(int i=0; i<amounts.length; i++){
            temp.add(new MealIngredient(ingredients[i].getName(), amounts[i]));
        }

        this.ingredients = (MealIngredient[]) temp.toArray();

        for(Ingredient ing: ingredients){
            calories += ing.getCalories();
            protein += ing.getProtein();
            carbs += ing.getCarbs();
            fats += ing.getFats();
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

    /**
     * Method that returns the array that holds ingredient names and their amount in the meal
     * @return
     */
    public MealIngredient[] getIngredients() {
        return ingredients;
    }
}
