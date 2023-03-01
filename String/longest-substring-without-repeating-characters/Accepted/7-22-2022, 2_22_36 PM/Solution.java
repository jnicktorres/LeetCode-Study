// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
         else if(s.length() == 1){
            return 1;
        }
        int longest = 0;
        
        int[] dict = new int[128];
        
        for(int l = 0, r = 0; r<s.length();r++){
            l = Math.max(l, dict[s.charAt(r)]);
            longest = Math.max(longest, r - l + 1);
            dict[s.charAt(r)] = r+1;
        }
        
        return longest;
        
}
}