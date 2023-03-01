// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        
        String str = Integer.toString(x);
        String reversestr = "";
        
        for(int i = (str.length() -1); i >=0; i--){
              reversestr = reversestr + str.charAt(i);
            
         }
        
     if (str.equals(reversestr))   {
         return true;
     }
     return false;   
        
    }
    
    
    }
