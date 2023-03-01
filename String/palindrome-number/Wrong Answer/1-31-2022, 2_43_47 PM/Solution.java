// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        String intStr = Integer.toString(x);
        
        String rev = "";
        
        for(int i = intStr.length() - 1;i>=0;i--){
            rev = rev + intStr.charAt(i);
            
            
            
        }
        if( rev == intStr){
            return true;
        }
        return false;
    }
}