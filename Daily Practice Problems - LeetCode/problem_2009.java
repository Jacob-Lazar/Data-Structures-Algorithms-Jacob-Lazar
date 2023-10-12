/*
2009. Minimum Number of Operations to Make Array Continuous
You are given an integer array nums. 
In one operation, you can replace any element in nums with any integer.

'nums' is considered continuous,
if both of the following conditions are fulfilled:

    All elements in nums are unique.
    The difference between the maximum element and the minimum element in nums equals nums.length - 1.

Return the minimum number of operations to make nums continuous.


Example 1:

Input: nums = [4,2,5,3]
Output: 0
Explanation: nums is already continuous.

Example 2:

Input: nums = [1,2,3,5,6]
Output: 1
Explanation: One possible solution is to change the last element to 4.
The resulting array is [1,2,3,5,4], which is continuous.

Example 3:

Input: nums = [1,10,100,1000]
Output: 3
Explanation: One possible solution is to:
- Change the second element to 2.
- Change the third element to 3.
- Change the fourth element to 4.
The resulting array is [1,2,3,4], which is continuous.
 */

import java.util.Arrays;

public class problem_2009 {
    public int minOperations(int[] nums) {
        int N = nums.length;
        int ans = N;
        int j = 0;

        // Sort the array
        Arrays.sort(nums);

        // Remove duplicates to only keep unique elements
        int M = 1;
        for (int i = 1; i < N; ++i) {
            if (nums[i] != nums[i - 1]) {
                  nums[M] = nums[i];
                  M++;
            }
        }

        for (int i = 0; i < M; ++i) {
            while (j < M && nums[j] < nums[i] + N) {
                ++j;
            }
            // The length of this subarray is `j - i`. We need to replace `N - j + i` elements to make it continuous.
            ans = Math.min(ans, N - j + i);
        }

        return ans;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,5,7};
        problem_2009 obj = new problem_2009();
        System.out.println(obj.minOperations(nums));
    }
}
