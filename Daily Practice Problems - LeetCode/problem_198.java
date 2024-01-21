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