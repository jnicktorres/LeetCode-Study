// https://leetcode.com/problems/word-ladder

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> reached = new HashSet<String>();
        reached.add(beginWord);
        wordList.add(endWord);
        int distance = 1;
        while(!reached.contains(endWord)){
            Set<String> toAdd = new HashSet<String>();
            for(String each : reached){
                for(int i = 0; i < each.length();i++){
                char[] chars = each.toCharArray();
                    for(char ch = 'a';ch <= 'z';ch++){
                        chars[i] = ch;
                        String word = new String(chars);
                        if(wordList.contains(word)){
                            toAdd.add(word);
                            wordList.remove(word);
                        }
                    }
                }
            }
                
                distance++;
                if(toAdd.size() == 0) return 0;
                
                reached = toAdd;
                
        
        }
        
    
      return distance;
    }
}