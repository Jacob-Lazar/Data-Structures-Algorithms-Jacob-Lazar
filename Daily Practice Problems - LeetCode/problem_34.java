/*
 * 34. Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */

import java.util.*;
public class problem_34 {
    public int[] searchRange(int[] nums, int target) {
        
        int r = nums.length - 1;
        int l = 0;
        int mid = -1;
        boolean flag = false;

        while (l != r) {
            mid = (l+r)/2;
            if (nums[mid] == target) {
                flag = true;
                break;
            }
            else if (nums[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }

        if (flag == false) 
            return new int[] {-1, -1};
        
        else {
            for (int i = mid, j = mid; j >= 0 && i < nums.length; i++, j--) {
                if (i >= 0 && nums[i] == target)
                    r = i;
                if (j < nums.length && nums[j] == target)
                    l = j;
            }
        }
        
        return new int[] {l, r};
    }
}

/*
Sure, I'd be happy to provide more detailed explanations and examples for each point:

1. **Binary Search Condition**: 
In your original code, you used `while (l != r)`. 
This condition can cause the loop to exit before all elements have been checked. 
For example, consider an array `nums = [2, 2, 2, 3, 3]` and `target = 3`. 
In this case, the loop will exit when `l` is at the second `2` and `r` is at the first `3`, missing the last element. 
In the corrected code, we use `while (l <= r)`, which ensures that all elements are checked.

2. **Mid Calculation**: In your original code, you calculated mid as `(l+r)/2`. This can sometimes lead to integer overflow if `l` and `r` are both very large (close to the maximum positive int value). Integer overflow is a condition that occurs when the result of an integer operation falls outside the range that can be represented. For example, if we have `l = 2^30` and `r = 2^30`, then `(l+r)/2` will result in integer overflow. The corrected code uses `mid = l + (r - l) / 2` to avoid potential integer overflow.

3. **Finding First and Last Position**: In your original code, you used a single loop to find both the first and last positions of the target. However, the loop condition `j >= 0 && i < nums.length` is incorrect because it stops when either `j` is less than 0 or `i` is greater than or equal to `nums.length`. This means that if `j` reaches -1 before `i` reaches `nums.length`, the loop will stop, leaving some elements unchecked. For example, consider an array `nums = [2, 3, 3, 3]` and `target = 3`. In this case, your loop will stop when it finds the first occurrence of `3`, missing the last two elements.

   In the corrected code, we use two separate while loops to find the first and last positions of the target:
   - The first loop moves to the left until it finds the first occurrence of the target: `while (left > 0 && nums[left - 1] == target) --left;`
   - The second loop moves to the right until it finds the last occurrence of the target: `while (right < nums.length - 1 && nums[right + 1] == target) ++right;`

These changes ensure that all elements are checked and maintains a time complexity of O(log n), which meets the problem's requirements. I hope this explanation helps! Let me know if you have any other questions.
 */