package sample.JavaClasses;

/**
 * Class containing the name and amount of an ingredient from a meal
 */
public class MealIngredient {

    private String name;
    private float amount;

    /**
     * Constructor of the MealIngredient class
     * @param name of the ingredient
     * @param amount of the ingredient in the meal
     */
    public MealIngredient(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    /**
     * Returns the amount of the ingredients in the meal in grams *100
     * @return amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Returns the name of the ingredient
     * @return name
     */
    public String getName() {
        return name;
    }
}
