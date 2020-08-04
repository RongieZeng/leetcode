/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int maxArea = 0;

        while(i!=j){            
            
            if(height[i]<height[j]){
                maxArea = Math.max(maxArea, height[i] * (j - i));
                i++;
            }else{
                maxArea = Math.max(maxArea,height[j] * (j - i));
                j--;
            }
        }

        return maxArea;
    }
}
// @lc code=end

