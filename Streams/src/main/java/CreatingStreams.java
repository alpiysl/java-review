import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

        //Creating stream from Array
        String[] courses = {"Java", "JS", "TS"};
        Stream<String> courseStream = Arrays.stream(courses);


        //Creating stream from collection
        List<String> courseList = Arrays.asList("Java", "JS", "TS");
        Stream<String> courseStr = courseList.stream();

        List<Course> myCourse = Arrays.asList(
                new Course("Java", 100),
                new Course("JS", 1),
                new Course("TS", 2),
                new Course("Phyton", 3)
        );

        Stream<Course> myCourseStream = myCourse.stream();

        //Creating streams from values
        Stream<Integer> stream = Stream.of(1,2,3,4);

    }
}
