package sample.JavaClasses;

/**
 * Class containing the name and nutritional values of some kind of food
 */
public class Ingredient {

    private String name;
    private double calories;
    private double protein;
    private double carbs;
    private double fats;

    /**
     * Constructor of the Food class
     */
    public Ingredient(String name, double calories, double protein, double carbs, double fats) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }

    /**
     * Method that returns the name of the food
     */
    public String getName() {
        return name;
    }

    /**
     * Method that returns the number of kcal of the food
     */
    public double getCalories() {
        return calories;
    }

    /**
     * Method that returns the number of proteins in the food per 100g
     */
    public double getProtein() {
        return protein;
    }

    /**
     * Method that returns the number of carbohydrates in the food per 100g
     */
    public double getCarbs() {
        return carbs;
    }

    /**
     * Method that returns the number of fats in the food per 100g
     */
    public double getFats() {
        return fats;
    }
}
