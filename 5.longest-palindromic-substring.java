/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }

        int maxIndex = 0;
        int maxRight = 0, pos = 0, maxLength = 0;
        char[] chars = new char[2 * s.length() + 1];
        int[] lens = new int[chars.length];
        for(int i = 0; i < chars.length; i++){
            if(i%2 != 0 && i/2<=s.length()-1){
                chars[i] = s.charAt(i/2);
            }else{
                chars[i] = '#';
            }
        }

        int i = 0;
        while(i<chars.length){
            if(i<maxRight){
                lens[i] = Math.min(lens[2*pos - i], maxRight - i);
            }else{
                lens[i] = 1;
            }

            while( i-lens[i]>=0 && i+lens[i] < chars.length && chars[i-lens[i]] == chars[i+lens[i]]){
                lens[i]++;
            }

            if(i+lens[i]-1>maxRight){
                maxRight = i+lens[i]-1;
                pos = i;
            }

            if(lens[i]>maxLength){
                maxLength = lens[i];
                maxIndex = i;
            }

            i++;
        }

        String result = "";
        for(int j = maxIndex - lens[maxIndex] + 1; j< maxIndex + lens[maxIndex] -1; j++){
            if(chars[j]!='#'){
                result+=chars[j];
            }
        }

        return result;
    }
}
// @lc code=end

