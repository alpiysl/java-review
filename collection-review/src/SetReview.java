import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<Student> mySet = new HashSet<>();
        mySet.add(new Student(1,"nick"));
        mySet.add(new Student(2,"ozzy"));
        mySet.add(new Student(3,"joe"));
        mySet.add(new Student(3,"joe"));
        System.out.println(mySet);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set);
        System.out.println(set.add(2));//--> wii return false

        String text = "Java Developer";
        System.out.println(firstRepeatingChar(text));

    }

    public static Character firstRepeatingChar(String str){
        Set<Character> chars = new HashSet<>();
        for (Character character : str.toCharArray()) if(!chars.add(character)) return character;
        return null;


    }
}
