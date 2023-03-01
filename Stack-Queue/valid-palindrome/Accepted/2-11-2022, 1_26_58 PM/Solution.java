// https://leetcode.com/problems/valid-palindrome

class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
       
        int end = s.length() - 1;
        
        while(start <= end){
            char chars = s.charAt(start);
            char chare = s.charAt(end);
            if(!Character.isLetterOrDigit(chars)){
                start++;
            }
            else if(!Character.isLetterOrDigit(chare)){
                end--;
            }
            else{
                if(Character.toLowerCase(chars) != Character.toLowerCase(chare)){
                    return false;
                }
                start++;
                end--;
                
            }
            
        }
                    return true;
    }
}