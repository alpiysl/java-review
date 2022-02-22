package Day3.Collectors;

import Day1.Dish;
import Day1.DishData;
import Day1.Type;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,4,5,6,6,6);

        //toCollection(Supplier) -> is used to create a collection using collector
        System.out.println("******toCollection()*****");
        List<Integer> nums = numbers.stream().
                filter(x -> x%2==0).
                collect(Collectors.toCollection(ArrayList::new));
        System.out.println("nums = " + nums);

        Set<Integer> numSet = numbers.stream().
                filter(x -> x%2==0).
                collect(Collectors.toCollection(HashSet::new));
        System.out.println("numSet = " + numSet);

        //toList() -> returns a Collector interface that gathers the input data into a new list
        System.out.println("******toList()*****");
        List<Integer> nums2 = numbers.stream().
                filter(x -> x%2==0).
                collect(Collectors.toList());
        System.out.println("nums2 = " + nums2);

        //toSet() -> returns a Collector interface that gathers the input data into a new set
        System.out.println("******toList()*****");
        Set<Integer> nums3 = numbers.stream().
                filter(x -> x%2==0).
                collect(Collectors.toSet());
        System.out.println("nums3 = " + nums3);

        //toMap(Function,Function) -> returns a Collector interface that gathers input data into a new map
        System.out.println("******toMap()*****");
        Map<String,Integer> map = DishData.getAll().stream().
                collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println("map = " + map);

        //counting() -> returns Collector that counts the number of the elements
        System.out.println("******counting()*****");
        Long l = numbers.stream().
                filter(x -> x%2==0).
                collect(Collectors.counting());
        System.out.println("l = " + l);

        //summingInt(ToIntFunction) -> returns a Collector that produces the sum of integer valued func
        System.out.println("******summingInt()*****");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = " + sum);

        //averageingInt(ToIntFunction) -> returns average
        System.out.println("******summingInt()*****");
        Double av = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("av = " + av);

        //joining() -> is used to join various elements of a character or string array into a single string object
        System.out.println("******joining()*****");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String course = courses.stream().
                collect(Collectors.joining(","));
        System.out.println("courses = " + course);

        //partitioningBy() -> is used to partition(parçalama) a stream of objects(or set of elements) based on a given predicate
        //grouping according to predicate -> true or false
        System.out.println("******partitioningBy()*****");
        Map<Boolean,List<Dish>> map1 = DishData.getAll().stream().
                collect(Collectors.partitioningBy(Dish::isVeg));
        System.out.println("map1 = " + map1);

        //groupingBy() -> is used for grouping objects by some property and storing results in a map instance
        //group what we decide
        System.out.println("******groupingBy()*****");
        Map<Type,List<Dish>> map2 = DishData.getAll().stream().
                collect(Collectors.groupingBy(Dish::getType));
        System.out.println("map2 = " + map2);

    }
}
