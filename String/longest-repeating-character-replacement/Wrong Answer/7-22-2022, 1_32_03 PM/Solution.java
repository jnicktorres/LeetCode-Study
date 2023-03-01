// https://leetcode.com/problems/longest-repeating-character-replacement

class Solution {
    public int characterReplacement(String s, int k) {
        int[] dict = new int[26];
        
        int start = 0;
        int maxlen = 0;
        
        for(int end = 0; end < s.length();end++){
            maxlen = Math.max(maxlen, ++dict[s.charAt(end)-'A']);
            if(end - start + 1 > maxlen + k){
                dict[s.charAt(end)-'A']--;
                start++;
                
            }
        }
        
        return s.length() -start;
            
            
            
        
    }
}