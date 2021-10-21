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
        MealIngredient[] loadData = loadData();
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

    public MealIngredient[] loadData(){

        try (JsonReader reader = new JsonReader(new FileReader("src/sample/DataStorage/meals.json"))) {
            Gson gson = new Gson();

            MealIngredient[] data = gson.fromJson(reader, MealIngredient[].class);

            return data;
        }catch(IOException e){
            System.out.println(e);
            return null;
        }

    }
}
