// https://leetcode.com/problems/longest-palindromic-substring

class Solution {
    public String longestPalindrome(String s) {
        
        int start = 0;
        int end = 0;
        
        for(int i = 0; i<s.length();i++){
            char cur = s.charAt(i);
            int left = i;
            int right = i;
            while(left>=0 && s.charAt(left) == cur){
                left--;
            }
            while(right<s.length() && s.charAt(right) == cur){
                right++;
            }
            
            while(left>=0 && right<s.length()){
                if(s.charAt(left) != s.charAt(right)){
                    break;
                }
                left--;
                right++;
            }
            left = left+1;
            if(end-start < right - left){
                start = left;
                end = right;
            }
            
        }
        
        return s.substring(start,end);
        
        
    }
}