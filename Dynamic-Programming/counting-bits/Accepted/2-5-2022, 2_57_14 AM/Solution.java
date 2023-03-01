// https://leetcode.com/problems/counting-bits

class Solution {
    public int[] countBits(int n) {
        
        int[] ret = new int[n+1];
        
        for(int i = 1; i <ret.length; i++ ){
            
            ret[i] = ret[i>>1] + i%2;
        }
        return ret;
    }
}