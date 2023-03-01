// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
       }
        else if(s.length() == 1){
            return 1;
        }
        int max = 0;
        HashMap<Character, Integer> set = new HashMap<Character,Integer>();
        
        for(int i =0, j = 0; i < s.length();i++){
            if(set.containsKey(s.charAt(i))){
                j = Math.max(j, set.get(s.charAt(i))+1);
            }
            set.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        
        return max;
    }
}