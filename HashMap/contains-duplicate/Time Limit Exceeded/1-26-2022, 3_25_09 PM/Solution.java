// https://leetcode.com/problems/contains-duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(hash.containsValue(nums[i])){
                return true;
            }
            else{
                hash.put(i,nums[i]);
            }
        }
        return false;
        
    }
}