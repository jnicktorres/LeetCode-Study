// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        
        int remNumber = 0;
        int reversedNum = x;
        
        while (reversedNum != 0 ){
        int remainder = reversedNum % 10;
        reversedNum = (remNumber * 10) + remainder;     
        x /= 10;          
        
        if(remNumber == x){
            
            return true;
        }
        
    }
        
        return false;
    }
}