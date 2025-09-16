public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) 
            {
                if (nums[i] + nums[j] == target) 
                {
                    return new int[]{i, j}; // Return the indices of the two numbers
                }
            }
        }
        return new int[]{}; // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 14};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}