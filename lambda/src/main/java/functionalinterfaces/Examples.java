package functionalinterfaces;

import java.util.function.Predicate;

public class Examples {

    public static void main(String[] args) {

        //***PREDICATE*****

        Predicate<Integer> lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer<18;
            }
        };

        System.out.println(lesserThan.test(50));

        Predicate<Integer> less = a -> a<18; //Implementation of test method that belongs to Predicate Interface

        System.out.println(less.test(50));

    }
}
