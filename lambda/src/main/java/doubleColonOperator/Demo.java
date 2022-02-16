package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {

        //Referencing to static
        Calculate s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(10, 3);

        Calculate s2 = Calculator::findSum;
        s2.calculate(10, 3);

        //Referencing to instance
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x,y);
        m1.calculate(10,20);

        Calculator calculator = new Calculator();
        Calculate m2 = calculator::findMultiply;
        m2.calculate(10,20);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(10,20);

        BiFunction<String,Integer,String> fn = (str,i) -> str.substring(i);
        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer",6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);
        Consumer<Integer> display2 = System.out::println;
        display2.accept(20);

        BiFunction<MyClass,Integer,Double> v2 = MyClass::method;
        BiFunction<String,String,String> v3 = String::concat;


    }
}
