package Day1;

import Day1.Dish;
import Day1.DishData;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //print all dish name less than 400 cal.
        DishData.getAll().stream().
                filter(dish -> dish.getCalories() < 400).
                map(Dish::getName).
                forEach(System.out::println);

        //print length of the names
        System.out.println("*********");
        DishData.getAll().stream().
                map(Dish::getName).
                map(String::length).
                forEach(System.out::println);

        //print 3 high dish name
        System.out.println("*********");
        DishData.getAll().stream().
                filter(dish -> dish.getCalories() > 300).
                map(Dish::getName).
                limit(3).
                forEach(System.out::println);

        //print all dish name that are below 400 cal in sorted
        System.out.println("*********");
        DishData.getAll().stream().
                filter(dish -> dish.getCalories() < 400).
                sorted(comparing(Dish::getCalories).reversed()).
                map(Dish::getName).
                forEach(System.out::println);
    }
}
