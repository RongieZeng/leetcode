import java.util.HashMap;


/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        char[] cs = s.toCharArray();
        int sum = 0;
        for(int i = 0; i<cs.length; i++){            
            int currentNum = findNumber(cs[i]);
            if(i+1<=cs.length - 1){                    
                int nextNum = findNumber(cs[i+1]);
                if(currentNum < nextNum){
                    sum += nextNum - currentNum;
                    i++;
                    continue;
                }
            }

            sum+=currentNum;
        }

        return sum;
    }

    int findNumber(char s){
        switch(s){
            case 'I':
                return 1;                
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;            
        }

        return 0;
    }
}
// @lc code=end

