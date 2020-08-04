import java.util.HashMap;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLen=0, currentLen = 0, left = 0, i = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        while (i<s.length()){
            char currentChar = s.charAt(i);
            if(!map.containsKey(currentChar) || left>map.get(currentChar)){
                currentLen++;
            }else{
                int pos = map.get(currentChar);
                currentLen = i - pos;
                left = pos+1;
            }

            map.put(currentChar, i);
            i++;

            longestLen = Math.max(currentLen, longestLen);
        }

        return longestLen;
    }
}
// @lc code=end

