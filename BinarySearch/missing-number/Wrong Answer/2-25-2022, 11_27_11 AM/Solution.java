// https://leetcode.com/problems/missing-number

class Solution {
    public int missingNumber(int[] nums) {
     HashMap<Integer, Integer> map = new HashMap();
        
        
        for(int i : nums){
            map.put(i,i);            
        }
        
        for(int i = 0; i < map.size();i++){
            if(map.containsKey(i)){
                
            }
            else{
            
            return i;
            }
        }
        
        return 0; 
    }
}