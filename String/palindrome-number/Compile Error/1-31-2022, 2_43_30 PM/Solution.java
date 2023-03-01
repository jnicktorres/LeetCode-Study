// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        string intStr = Integer.toString(x);
        
        string rev = "";
        
        for(int i = intstr.length() - 1;i>=0;i--){
            rev = rev + intStr.charAt(i);
            
            
            
        }
        if( rev == intStr){
            return true;
        }
        return false;
    }
}