// https://leetcode.com/problems/climbing-stairs

class Solution {
    public int climbStairs(int n) {
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 2;
        
        for(int i = 2;i<n+1;i++){
            a[i] = a[i-1] + a[i-2];
        }
        
        return a[n];
    }
}