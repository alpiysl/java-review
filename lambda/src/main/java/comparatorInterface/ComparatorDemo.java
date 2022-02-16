package comparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 1, 2, 3, 4);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, ((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0));
        System.out.println(list);

        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        list.sort(Integer::compareTo);
        System.out.println(list);

        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(10, Color.RED),
                new Apple(20, Color.GREEN)
        );

        Comparator<Apple> sortApple = comparing(Apple::getWeight);
        inventory.sort(sortApple);
        System.out.println(inventory);

        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //Reversed
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        inventory.sort(comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor));
        System.out.println(inventory);
    }

}
