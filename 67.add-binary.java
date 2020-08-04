/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int carry = 0, i = a.length()-1, j = b.length()-1;
        StringBuilder sb = new StringBuilder();

        while(i>=0||j>=0){
            int count = 0;
            if(i>=0 && a.charAt(i--) == '1'){
                count++;
            }

            if(j>=0 && b.charAt(j--) == '1'){
                count++;
            }

            if(carry==1){
                count++;
            }

            carry = count/2;
            sb.append(count%2);
        }
        
        if(carry!=0){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
// @lc code=end

