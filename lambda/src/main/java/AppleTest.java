import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(200, Color.RED));
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(400, Color.RED));

//        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPred());
//        List<Apple> greenApple = filterApples(inventory, new AppleGreenCPred());
//        System.out.println(heavyApple);
//        System.out.println(greenApple);
        System.out.println(filterApples(inventory, apple -> apple.getWeight() > 200));
        System.out.println(filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN)));

    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) result.add(apple);
        }
        return result;
    }

//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
//        List<Apple> result = new ArrayList<>();
//
//        for (Apple apple : inventory) {
//            if (applePredicate.test(apple)) result.add(apple);
//        }
//
//        return result;
//    }
}
