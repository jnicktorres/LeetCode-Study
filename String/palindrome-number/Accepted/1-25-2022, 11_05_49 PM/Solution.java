// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
         String strInt = String.valueOf(x);
         String reverseString = "";
        
        for(int i = strInt.length()-1; i >= 0;i--){
            reverseString = reverseString + strInt.charAt(i);
                        
        }
        
        if(strInt.equals(reverseString)){
            return true;
        }
        
        return false;
    }
}