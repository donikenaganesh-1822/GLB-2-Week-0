public class MissingNum{
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        
        for (int i =0; i<nums.length;i++) {
            actualSum += nums[i]; // Calculate the sum of the given array
        }
        
        return expectedSum - actualSum; // The missing number is the difference
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("The missing number is: " + missingNumber(nums)); // Output: 2
    }
}