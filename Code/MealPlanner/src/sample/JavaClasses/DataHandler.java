package sample.JavaClasses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Class responsible for loading and saving meals and ingredients from local storage
 */
public class DataHandler {

    /**
     * Constructor of the DataHandler class
     */
    public DataHandler() {
    }

    //mealIngredient for testing purposes for now
    public void saveMeal(MealIngredient data){
        MealIngredient[] loadData = null;
        try (Writer writer = new FileWriter("src/sample/DataStorage/meals.json")) {
            Gson gson = new GsonBuilder().create();

            //creates a new array that will hold recorded
            MealIngredient[] saveData = Arrays.copyOf(loadData, loadData.length+ 1);
            saveData[saveData.length-1] = data;

            gson.toJson(saveData, writer);

        }catch(IOException e){
            System.out.println(e);
        }
    }

    public Meal[] loadData(String name){

        try (JsonReader reader = new JsonReader(new FileReader("src/sample/DataStorage/" + name + ".json"))) {
            Gson gson = new Gson();

            Meal[] data = gson.fromJson(reader, Meal[].class);

            return data;
        }catch(IOException e){
            System.out.println(e);
            return null;
        }

    }

    public Ingredient[] loadIngredients(){

        try (JsonReader reader = new JsonReader(new FileReader("src/sample/DataStorage/data.json"))) {
            Gson gson = new Gson();

            Ingredient[] data = gson.fromJson(reader, Ingredient[].class);

            return data;
        }catch(IOException e){
            System.out.println(e);
            return null;
        }
    }
}
