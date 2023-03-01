// https://leetcode.com/problems/1-bit-and-2-bit-characters

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length %2 != 0 || bits.length  == 2 ){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}