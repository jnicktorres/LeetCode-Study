// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        
        int reverseNumber = 0;
        x = reverseNumber;
        
        while(reverseNumber != 0){
        int remainder = (reverseNumber%10);
        reverseNumber = reverseNumber *10 + remainder;
        reverseNumber /= 10;            
        }
        
        if(x == reverseNumber){
        return true;
        
        }
        else{
            
            return false;
        }
        
    }
}