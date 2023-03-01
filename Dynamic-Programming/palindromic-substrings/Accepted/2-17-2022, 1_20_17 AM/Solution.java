// https://leetcode.com/problems/palindromic-substrings

class Solution {
    int res = 0;
    
    public int countSubstrings(String s) {
        for(int i = 0; i < s.length();i++){
            count(s,i,i);
            count(s,i,i+1);
        }
        return res;
        }
    private void count(String s, int left, int right){
         while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
             left--;
             right++;
             res++;
         }
        
    }
        
    }
