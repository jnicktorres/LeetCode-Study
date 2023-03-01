// https://leetcode.com/problems/number-of-1-bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        
        while(n != 0){
        res+=(n%2) & 1;
        
        n>>=1; 
        }
        return res;
    }
}