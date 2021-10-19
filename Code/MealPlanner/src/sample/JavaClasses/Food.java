package sample.JavaClasses;

/**
 * Class containing the name and nutritional values of some kind of food
 */
public abstract class Food {

    private String name;
    private float calories;
    private float protein;
    private float carbs;
    private float fats;

    /**
     * Constructor of the Food class
     */
    public Food(String name, float calories, float protein, float carbs, float fats) {
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
    public float getCalories() {
        return calories;
    }

    /**
     * Method that returns the number of proteins in the food per 100g
     */
    public float getProtein() {
        return protein;
    }

    /**
     * Method that returns the number of carbohydrates in the food per 100g
     */
    public float getCarbs() {
        return carbs;
    }

    /**
     * Method that returns the number of fats in the food per 100g
     */
    public float getFats() {
        return fats;
    }
}
