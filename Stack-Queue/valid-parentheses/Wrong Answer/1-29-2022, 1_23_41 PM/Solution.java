// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        
        for(int i = 0; i < s.length();i+=2){
            if(s.charAt(i) == '(' && !(s.charAt(i+1) == ')')){
                return false;
            }
             else if(s.charAt(i) == '[' && !(s.charAt(i+1) == ']')){
                return false;
            }
             else if(s.charAt(i) == '{' && !(s.charAt(i+1) == '}')){
                return false;
            }
        }
        
        return true;
    }
}