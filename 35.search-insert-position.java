/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        
        int low = 0, high = nums.length - 1;
        while(high - low > 1){
            int middle = (low + high)/2;
            if(target>nums[middle]){
                low = middle;
            }else if(target<nums[middle]){
                high = middle;                
            }else{
                return middle;
            }
        }

        if(target<=nums[low]){
            return low;
        }else if(target>nums[low] && target<=nums[high]){
            return low + 1;
        }else {
            return high + 1;
        }
    }
}
// @lc code=end

