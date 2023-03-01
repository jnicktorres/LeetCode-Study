// https://leetcode.com/problems/word-ladder

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> WordDict = new HashSet<String>(wordList);
        
            return sol(WordDict, beginWord, endWord);
    }
    
    public int sol(Set<String> WordDict, String beg, String end){
        if(!WordDict.contains(end)){
            return 0;
        }
        Set<String> reached = new HashSet<String>();
        
        reached.add(beg);
        int distance = 1;
        
        while(!reached.contains(end)){
            Set<String> toadd = new HashSet<String>();
                for(String each : reached){
                    for(int i = 0 ;i < each.length();i++){
                        char[] c = each.toCharArray();
                        for(char j = 'a'; j <= 'z'; j++){
                            c[i] = j;
                            String word = new String(c);
                            if(WordDict.contains(word)){
                                toadd.add(word);
                                WordDict.remove(word);
                                
                            }
                         
                        }
                      
                    }
                    
                }
            
            distance++;
            
            if(toadd.size() == 0){
                return 0;
            }    
             reached = toadd;
            
            
        }
        
        
        return distance;
        
        
        
        
        
    }
}