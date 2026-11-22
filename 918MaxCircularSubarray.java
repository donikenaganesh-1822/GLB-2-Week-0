public class        MaxCircularSubarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = nums[0];
        int currentMax = nums[0];
        int maxSum = nums[0];
        int currentMin = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            totalSum = totalSum + num;

            if (currentMax + num > num) {
                currentMax = currentMax + num;
            } else {
                currentMax = num;
            }

            if (currentMax > maxSum) {
                maxSum = currentMax;
            }

            if (currentMin + num < num) {
                currentMin = currentMin + num;
            } else {
                currentMin = num;
            }

            if (currentMin < minSum) {
                minSum = currentMin;
            }
        }

        if (maxSum < 0) {
            return maxSum;
        }

        int circularSum = totalSum - minSum;

        if (circularSum > maxSum) {
            return circularSum;
        } else {
            return maxSum;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};
        int answer = maxSubarraySumCircular(nums);
        System.out.println(answer);
    }
}