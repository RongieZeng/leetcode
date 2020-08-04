/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int tempSum = nums[0];
        for(int i = 1;i<nums.length;i++) {
            int tempSum1=tempSum+nums[i];
            if(tempSum1>nums[i]){
                tempSum = tempSum1 ;
            }else{
                tempSum = nums[i];
            }            
            
            if(tempSum>sum){
                sum = tempSum;
            }
        }

        return sum;
    }
}
// @lc code=end

