// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        
        String xstr = Integer.toString(x);
        String rev = "";
        
        
        for(int i = xstr.length()-1; i >= 0;i--){
            rev += xstr.charAt(i);       
            
        }
        
        if(rev.equals(xstr)){
            return true;
        }
        return false;
    }
}