import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        System.out.println(Arrays.toString(twoSum2(arr, 9)));
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == target) return new int[]{i, j};
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int potM = target - arr[i];
            if (map.containsKey(potM)) return new int[]{map.get(potM), i};
            else map.put(arr[i], i);
        }
        return new int[]{};
    }
}
