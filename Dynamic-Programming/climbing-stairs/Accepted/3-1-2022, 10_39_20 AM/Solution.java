// https://leetcode.com/problems/climbing-stairs

class Solution {
    public int climbStairs(int n) {
        int[] mat = new int[n+1];
        mat[0] = 1;
        mat[1] = 1;
        
        for(int i = 2; i <= n; i ++){
            
            mat[i] = mat[i-1] + mat[i-2];
        }
        return mat[n];
        
    }
}