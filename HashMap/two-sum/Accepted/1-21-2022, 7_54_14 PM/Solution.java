// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        
        
        for(int i = 0;i < nums.length;i++){
            int difference = (target-nums[i]);
            
                if(hash.containsKey(difference)){
                   int[] ToReturn = {hash.get(difference), i};
                   return ToReturn;                                          
                }      
            else{
            hash.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}