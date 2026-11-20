public class GoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i = i + 1) {
            for (int j = i + 1; j < n; j = j + 1) {
                if (nums[i] == nums[j]) {
                    count = count + 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int answer = numIdenticalPairs(nums);
        System.out.println("Output: " + answer);
    }
}