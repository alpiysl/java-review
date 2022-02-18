package Day2;

import Day1.Dish;
import Day1.DishData;

import java.util.Optional;

public class MatchingFinding {

    public static void main(String[] args) {
        //All match
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println("isHealthy = " + isHealthy);

        System.out.println("-------------");
        //Any match
        if(DishData.getAll().stream().anyMatch(Dish::isVeg)) System.out.println("The menu is veg");

        System.out.println("-------------");
        //None match
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>= 1000);
        System.out.println("isHealthy = " + isHealthy2);

        System.out.println("-------------");
        //find any
        Optional<Dish> dish = DishData.getAll().stream().
                filter(Dish::isVeg).
                findAny();
        System.out.println("dish = " + dish);

        System.out.println("-------------");
        //find first
        Optional<Dish> dish2 = DishData.getAll().stream().
                filter(Dish::isVeg).
                findFirst();
        System.out.println("dish = " + dish2);
    }
}
