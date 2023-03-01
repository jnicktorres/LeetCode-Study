// https://leetcode.com/problems/climbing-stairs

class Solution {
    public int climbStairs(int n) {
        int[] s = new int[n+1];
        
        int[0] = 1;
        int[1] = 1;
        
        for(int i = 2; i <= n; i++){
            s[i] = s[i-1] + s[i-2];
            
            
        }
        return s[n];
        
        
    }
}