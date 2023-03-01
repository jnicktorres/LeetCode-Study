// https://leetcode.com/problems/valid-anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        int[] alphabet = new int[24];
        
        for(int i = 0; i < s.length();i++){
            int val = s.charAt(i) - 'a';
            int val2 =  t.charAt(i) - 'a';
            alphabet[val]++;
            alphabet[val2]--;
                      
        }
        
        for(int i = 0; i < s.length();i++){
            if(alphabet[i] != 0){
                return false;
            }
        }
        
        return true;
        
    }
}