// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        String intStr = Integer.toString(x);     
    
        if( x < 0){
            return false;
        }
        
        for(int i = 0; i < intStr.length() / 2; i++){            
           if(intStr.charAt(i) != intStr.charAt(intStr.length() -i - 1)){
               return false;
           }                                
        }
         return true;
    }
}