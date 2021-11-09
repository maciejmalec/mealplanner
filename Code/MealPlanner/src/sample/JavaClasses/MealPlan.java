package sample.JavaClasses;

public class MealPlan {

    private Meal[] breakfasts;
    private Meal[] snacks;
    private Meal[] dinners;
    private Meal[] suppers;

    public MealPlan() {
        createPlan();
    }

    public void createPlan(){
        //from the loaded meals generate 20 unique meals with 5 of each label
        DataHandler dh = new DataHandler();
        Meal[] meals = dh.loadMeals();

        for(int i=0; i<4; i++){

        }
    }

    public Meal[] getSuppers() {
        return suppers;
    }

    public Meal[] getDinners() {
        return dinners;
    }

    public Meal[] getBreakfasts() {
        return breakfasts;
    }

    public Meal[] getSnacks() {
        return snacks;
    }
}
