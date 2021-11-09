package sample.JavaClasses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Class responsible for loading and saving meals and ingredients from local storage
 */
public class DataHandler {

    Gson gson;

    /**
     * Constructor of the DataHandler class
     */
    public DataHandler() {
    }

    //mealIngredient for testing purposes for now
    public void saveMeal(Meal meal){

        ArrayList<Meal> meals = new ArrayList<>(Arrays.asList(loadMeals()));

        try (Writer writer = new FileWriter("src/sample/DataStorage/meals.json")) {
            gson = new GsonBuilder().create();

            meals.add(meal);

            gson.toJson(meals, writer);
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }

    public Meal[] loadMeals(){

        try (FileReader fileReader = new FileReader("src/sample/DataStorage/meals.json")) {
            gson = new Gson();
            return gson.fromJson(fileReader, Meal[].class);
        }catch(IOException e){
            System.out.println(e.toString());
            return null;
        }
    }

    public Ingredient[] loadIngredients(){

        try (JsonReader reader = new JsonReader(new FileReader("src/sample/DataStorage/data.json"))) {
            gson = new Gson();

            return gson.fromJson(reader, Ingredient[].class);
        }catch(IOException e){
            System.out.println(e.toString());
            return null;
        }
    }

//    public MealPlan loadMealPlan(){
//
//
//
//    }
}
