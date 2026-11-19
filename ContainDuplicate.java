
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) { // time complexity: O(n)
            for (int j = i + 1; j < nums.length; j++) { // time complexity: O(n^2)
                if (nums[i] == nums[j]) { // time complexity: O(1)
                    return true; // time complexity: O(1)
                }
            }
        } 
            return false; // time complexity: O(1)
        
        
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // time complexity: O(1)
        boolean result = containsDuplicate(nums); // time complexity: O(n^2)
        System.out.println(result); // time complexity: O(1)
    }
}

/**
 */