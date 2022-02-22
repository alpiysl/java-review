package Day3.Optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,4,5,6,7);
        
        //empty() - isPresent()
        Optional<String> empty = Optional.empty();
        System.out.println("empty.isPresent() = " + empty.isPresent());
        System.out.println(Optional.of(numbers).isPresent());

        //ifPresent
        Optional<Integer> num = numbers.stream().filter(x-> x>100).findAny();
        num.ifPresent(System.out::println);

        //get
//        System.out.println(num.get());

        //orElse
        System.out.println(num.orElse(0));
        
    }
}
