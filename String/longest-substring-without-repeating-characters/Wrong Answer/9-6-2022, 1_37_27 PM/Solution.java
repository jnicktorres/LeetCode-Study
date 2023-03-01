// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = left; right < s.length();right++){
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),1);
            }
            else{
                max = Math.max(max, map.size());
                map.clear();
                i++;
                right = i;
                
            }
            
            
        }
        
        
        return max;
        
        
        
        
    }
}