/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        boolean needPlusOne = true;
        boolean needAddLength = false;
        int[] newDigits = new int[digits.length+1];
        int currentIndex = 0;
        
        for(int i = digits.length - 1; i>=0; i-- ){
            if(needPlusOne == true ){
                digits[i]++;                
            }

            if(digits[i] >= 10){
                digits[i] = 0;
                if(i == 0){
                    needAddLength = true;
                    newDigits[currentIndex++] = digits[i];
                    newDigits[currentIndex] = 1;
                    continue;
                }
            } else{
                needPlusOne = false;
            }

            newDigits[currentIndex++] = digits[i];
        }

        int[] resultDigits = new int[needAddLength? newDigits.length : newDigits.length-1];
        int j = 0;
        for(int i = resultDigits.length -1; i>=0;i--){
            resultDigits[j++] = newDigits[i];
        }

        return resultDigits;
    }
}
// @lc code=end

