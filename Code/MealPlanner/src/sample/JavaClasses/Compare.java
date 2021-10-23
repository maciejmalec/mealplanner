package sample.JavaClasses;

import java.util.Comparator;

public class Compare implements Comparator<Ingredient> {

    @Override
    public int compare(Ingredient i1, Ingredient i2) {
        if(i1.getName().length() == i2.getName().length()){
            return 0;
        }else if(i1.getName().length() < i2.getName().length()){
            return -1;
        }else{
            return 1;
        }
    }
}
