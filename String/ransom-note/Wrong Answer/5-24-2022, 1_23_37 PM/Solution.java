// https://leetcode.com/problems/ransom-note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() == 0 || magazine.length() == 0 || magazine.length() <ransomNote.length()){
            return false;
        }
        
        int[] alphabet = new int[25];
        
        for(int i = 0; i < magazine.length();i++){
            if(i > ransomNote.length() -1){            
            break;             
            }
            int val1 = magazine.charAt(i) - 'a';
            int val2 = ransomNote.charAt(i) - 'a';
            alphabet[val1]++;
            alphabet[val2]--;
        }
        for(int i = 0; i < 25;i++){
            if(alphabet[i] < 0){
                return false;
            }
        }
        
        return true;
    }
}