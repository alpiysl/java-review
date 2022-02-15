package functionalinterfaces;

import java.util.function.*;

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


        //***CONSUMER*****
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        //***BICONSUMER*****

        BiConsumer<Integer,Integer> biConsumer = (x,y) -> System.out.println(x+y);
        biConsumer.accept(10,20);


        //***FUNCTION*****
//        Function<String,String> func = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return "Hello " + s ;
//            }
//        }
        Function<String,String> func = f -> "Hello " + f;
        System.out.println(func.apply("world"));

        //***SUPPLIER*****
        Supplier<Double> value = () -> Math.random();
        System.out.println(value.get());
    }
}
