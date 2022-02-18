package Day2;

import Day1.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Reducing {

    public static void main(String[] args) {

        //initial value
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println("result = " + result);

        //not initial value
        Optional<Integer> rr = numbers.stream().reduce(Integer::sum);
        System.out.println("rr = " + rr.get());
        System.out.println("rr = " + rr);

        //max and min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println("min = " + min.get());
        System.out.println("min = " + min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("max = " + max.get());
        System.out.println("max = " + max);

        //task
        int dishCount = DishData.getAll().stream().map(dish -> 1).reduce(0,Integer::sum);
        System.out.println("dishCount = " + dishCount);
        
        long dishC = DishData.getAll().stream().count();
        System.out.println("dishC = " + dishC);

    }
}
