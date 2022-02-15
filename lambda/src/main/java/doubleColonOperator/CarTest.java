package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //zero agr cons
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //one ard cons
        Function<Integer,Car> f1 = model -> new Car(model);
        Car bmw = f1.apply(10);
        System.out.println(bmw.getModel());

        Function<Integer,Car> f2 = Car::new;
        Car opel = f2.apply(20);
        System.out.println(opel.getModel());

        //two arg cons
        BiFunction<String,Integer,Car> b1 = (make,model)-> new Car(make,model);
        BiFunction<String,Integer,Car> b2 = Car::new;
        Car honda = b2.apply("honda",2001);
        System.out.println(honda.getModel());

    }

}
