// https://leetcode.com/problems/palindromic-substrings

class Solution {
    int sub = 0;
    public int countSubstrings(String s) {
        for(int i = 0; i < s.length();i++){                  
        count(s,i,i);
        count(s,i,i+1);
        }
        
        return sub;
    }
    
    private void count(String s, int left, int right){
        if(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            
            left--;
            right++;
            sub++;
            
        }
        
    }
}