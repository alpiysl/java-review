package Day1;

import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JAVA","HONDA","APPLE");
        words.stream().
                map(String::length).
                forEach(System.out::println);

    }
}
