package _01_towSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = { 2, 7, 11, 15 };
        int target = 22;
        twoSum(a, target);
    }

    private static int[] twoSum(int[] a, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                return new int[] { i, map.get(a[i]) };
            } else {
                int margin = target - a[i];
                map.put(margin, i);
            }
        }
        return null;
    }
}
