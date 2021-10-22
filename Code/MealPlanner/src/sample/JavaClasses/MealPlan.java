package sample.JavaClasses;

public class MealPlan {

    private Meal[] breakfasts;
    private Meal[] lunches;
    private Meal[] dinners;
    private Meal[] suppers;

    public MealPlan() {
        try{
            createPlan();
        }catch (Exception e){
            System.out.println("not enough meals to create a meal plan");
        }
    }

    public void createPlan(){
        //from the loaded meals generate 20 unique meals with 5 of each label
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

    public Meal[] getLunches() {
        return lunches;
    }
}
