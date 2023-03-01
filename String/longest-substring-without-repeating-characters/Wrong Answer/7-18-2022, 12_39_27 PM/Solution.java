// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
         else if(s.length() == 1){
            return 1;
        }
        
        HashMap<Character,Integer> map = new HashMap();
        int max = 0;
        for(int i = 0; i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                max = Math.max(max,map.size());
                map.clear();
            }
              map.put(s.charAt(i), 1);
        }
               
               return max;
    }
}