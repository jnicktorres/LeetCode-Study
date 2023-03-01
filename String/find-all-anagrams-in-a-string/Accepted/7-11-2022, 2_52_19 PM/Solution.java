// https://leetcode.com/problems/find-all-anagrams-in-a-string

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
           
        //sliding window 
        HashMap<Character, Integer> map = new HashMap();
        List<Integer> ls = new ArrayList();
        for(int i = 0; i < p.length();i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i),0) + 1);
        }
       
        int size = map.size();
        int start = 0;
        int end = 0;
                 
        while(end < s.length()){
            char endc = s.charAt(end);
            if(map.containsKey(endc)){
                int count = map.get(endc);
                if (count == 1) {
                    size--;
                }
                map.put(endc, count - 1);
            }
        
        end++;
          while( end - start > p.length()){
              char starc = s.charAt(start);
              if(map.containsKey(starc)){
                  int count = map.get(starc);
                  if(count == 0){
                      size++;
                  }
                  map.put(starc, count + 1);
              }
              start++;
              
          }
          if(size == 0){
              ls.add(start);
          }          
            
        }            
                    return ls;
    }
}