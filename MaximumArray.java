public class MaximumArray {
    public static void main(String[] args) {
      
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println("Output 1: " + maxSubArray(nums1)); // Expected: 6
        System.out.println("Output 2: " + maxSubArray(nums2)); // Expected: 1
        System.out.println("Output 3: " + maxSubArray(nums3)); // Expected: 23
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
