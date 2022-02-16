import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7);
//        list.forEach(System.out::println);

        System.out.println("----------FILTER");
        //FILTER
        list.stream().
                filter(i -> i % 2 == 0).
                forEach(System.out::println);

        System.out.println("----------DISTINCT");

        //DISTINCT
        list.stream().
                filter(i -> i % 2 == 0).
                distinct(). //repeated values omitted
                forEach(System.out::println);

        //LIMIT
        System.out.println("---------LIMIT");
        list.stream().
                filter(i -> i % 2 == 0).
                limit(2).
                forEach(System.out::println);

        System.out.println("---------SKIP");
        //SKIP
        list.stream().
                filter(i -> i % 2 == 0).
                skip(3).
                forEach(System.out::println);

        System.out.println("---------MAP");
        //MAP
        list.stream().
                map(i -> i * 2).
                filter(i -> i % 3 == 0).
                forEach(System.out::println);
    }
}
