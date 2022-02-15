package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("John").age(20).build());
        users.add(User.builder().firstName("Tom").lastName("Hanks").age(22).build());
        users.add(User.builder().firstName("Alp").lastName("Esin").age(23).build());
        users.add(User.builder().firstName("Ema").lastName("G").age(24).build());
        users.add(User.builder().firstName("Misha").lastName("Erdem").age(25).build());
        //print all elements in the list
        printName(users, p -> true);
        System.out.println("-----------");
        //print all users that last name starts with E
        printName(users, user -> user.getLastName().startsWith("E"));
    }

    private static void printName(List<User> users, Predicate<User> p) {
        for (User user : users) {
            if (p.test(user)) {
                System.out.println(user.toString());
            }
        }
    }

}
