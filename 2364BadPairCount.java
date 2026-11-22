//BadPairCount  is that index difference != to  difference of actual values at that index
import java.util.HashMap;

public class BadPairCount {
    public static long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = n * (n - 1) / 2;
        long goodPairs = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - i;

            if (map.containsKey(diff)) {
                int count = map.get(diff);
                goodPairs = goodPairs + count;
                map.put(diff, count + 1);
            } else {
                map.put(diff, 1);
            }
        }

        return totalPairs - goodPairs;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 3};
        long result = countBadPairs(nums);
        System.out.println(result);
    }
}