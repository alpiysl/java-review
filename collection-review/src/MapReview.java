import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        System.out.println(find1stNonRep("cydeo java dev"));

    }

    public static Character find1stNonRep(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count;
        for (Character c : str.toCharArray()) {
            if(map.containsKey(c)){
                count = map.get(c);
                map.put(c,count+1);
            } else map.put(c,1);
        }
        for (Character c : str.toCharArray()) {
            if(map.get(c)==1) return c;
        }
        return Character.MIN_VALUE;
    }
}
