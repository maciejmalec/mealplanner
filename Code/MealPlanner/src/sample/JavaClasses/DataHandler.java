package sample.JavaClasses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;
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
        try (Writer writer = new FileWriter("src/sample/DataStorage/meals.json")) {
            gson = new GsonBuilder().create();

            //creates a new array that will hold recorded
            Meal[] existingMeals = loadMeals();

            Meal[] saveData = Arrays.copyOf(existingMeals, existingMeals.length+ 1);
            saveData[saveData.length-1] = meal;

            gson.toJson(saveData, writer);

        }catch(IOException e){
            System.out.println(e.toString());
        }
    }

    public Meal[] loadMeals(){

        try (JsonReader reader = new JsonReader(new FileReader("src/sample/DataStorage/meals.json"))) {
            gson = new Gson();

            Meal[] data = gson.fromJson(reader, Meal[].class);

            return data;
        }catch(IOException e){
            System.out.println(e.toString());
            return null;
        }

    }

    public Ingredient[] loadIngredients(){

        try (JsonReader reader = new JsonReader(new FileReader("src/sample/DataStorage/data.json"))) {
            gson = new Gson();

            Ingredient[] data = gson.fromJson(reader, Ingredient[].class);

            return data;
        }catch(IOException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
