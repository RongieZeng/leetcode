/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
            
        if(x < 0 || x % 10 == 0){
            return false;
        }

        int res = 0;
        int num = x;

        while (num != 0){
            if(res>(Integer.MAX_VALUE - num%10)/10){
                return false;
            }

            res = res*10 + num%10;
            num /= 10;
            if(res == num){
                return true;
            }
        }

        return res == x;        
    }
}
// @lc code=end

