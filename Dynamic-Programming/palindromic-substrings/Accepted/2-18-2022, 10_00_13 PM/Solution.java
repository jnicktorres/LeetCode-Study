// https://leetcode.com/problems/palindromic-substrings

class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        for(int i = 0; i < s.length();i++){
            pal(s,i,i);
            pal(s,i,i+1);
        }
        
        return count;
    }
    
    private void pal(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
            count++;
            
        }
    }
}