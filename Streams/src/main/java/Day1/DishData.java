package Day1;

import Day1.Dish;

import java.util.Arrays;
import java.util.List;

public class DishData {

    public static List<Dish> getAll(){
        return Arrays.asList(
                new Dish("bird",false,100, Type.MEAT),
                new Dish("cheese",true,200, Type.OTHER),
                new Dish("beef",false,300, Type.MEAT),
                new Dish("shrimp",false,400, Type.FISH),
                new Dish("rice",true,500, Type.OTHER)
        );
    }
}
