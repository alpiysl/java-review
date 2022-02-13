import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
/*      before Java 5 we have need to cast what we need and we didnt specify the type
        thats why we do not get compiler error
*/
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("apple");
        printDouble(items);

/*      after java 5 we are noe able to specify the type,
        if there is sth error we get compiler error
*/

        ArrayList<Integer> i = new ArrayList<>();

    }

    private static void printDouble(ArrayList items) {

        for (Object item : items) {
            System.out.println((Integer) item * 2);
        }
    }
}
