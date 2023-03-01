// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0){
            
            return false;
        }
        
        int remNumber = 0;
        int reversedNum = x;
        int originalNum = x;
        while (x != 0 ){
        int remainder = x % 10;
        remNumber = (remNumber * 10) + remainder;     
        x /= 10;          
        }
        if(remNumber == originalNum){
            
            return true;
        }
        return false;
    }
        
        
    }
