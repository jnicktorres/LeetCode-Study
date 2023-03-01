// https://leetcode.com/problems/ransom-note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() == 0 || magazine.length() == 0 || magazine.length() <ransomNote.length()){
            return false;
        }
        
        int[] alphabet = new int[26];
        
        for(int i = 0; i < magazine.length();i++){
            if(i > ransomNote.length() -1){            
                  int val1 = magazine.charAt(i) - 'a';
            
            alphabet[val1]++;      
            }
            else{
            int val1 = magazine.charAt(i) - 'a';
            int val2 = ransomNote.charAt(i) - 'a';
            alphabet[val1]++;
            alphabet[val2]--;
            }
        }
        for(int i = 0; i < alphabet.length;i++){
            if(alphabet[i] < 0){
                return false;
            }
        }
        
        return true;
    }
}