//Iterative, beats 100% of java submissions
/*
 * We do not look forward, rather we look backwards 
 * i.e 
 * Up until this number, 
 * what is the maximum sum of a subarray that ends at this number
 */

import java.util.*;
class problem_198 {
    public int rob(int[] nums) {
        // Stores the maximum sum of a subarray ending at the current index
        int prevMax = 0;
        // Stores the maximum sum of a subarray ending at the previous index
        int currMax = 0;

        for (int x : nums) {
            // Keep track of the previous maximum sum before updating it
            int temp = currMax;
            /*Update the current maximum sum by considering two possibilities:
              1. Starting a new subarray from the current number
              2. Extending the previous subarray with the current number */
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }

    public static void main(String[] args) {
        problem_198 obj = new problem_198();
        int[] nums = {2, 1, 1, 2};
        System.out.println(obj.rob(nums));
    }
}
/* Recursive
import java.util.*;
class problem_198 {
    public int rob(int[] nums) {
        return rob(nums, nums.length - 1);
    }
   
    private int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    }

    public static void main(String[] args) {
        problem_198 obj = new problem_198();
        int[] nums = {2, 1, 1, 2};
        System.out.println(obj.rob(nums));
    }
}
*/