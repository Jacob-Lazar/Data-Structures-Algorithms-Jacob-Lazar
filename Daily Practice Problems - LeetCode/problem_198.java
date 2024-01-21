//Iterative, beats 100% of java submissions
import java.util.*;
class problem_198 {
    public int rob(int[] nums) {
        int prevMax = 0;
        int currMax = 0;
        for (int x : nums) {
            int temp = currMax;
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