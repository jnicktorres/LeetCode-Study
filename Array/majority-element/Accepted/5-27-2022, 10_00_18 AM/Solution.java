// https://leetcode.com/problems/majority-element

class Solution {
    public int majorityElement(int[] nums) {
        int maj = (nums.length/2) + 1;
        HashMap<Integer,Integer> map = new HashMap();
        
        if(nums.length == 1){
            return nums[0];
        }
            
        
        for(int i = 0; i < nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.replace(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i]) == maj){
                    return nums[i];
                }
                
            }
            
        }
        
        return -1;
        
    }
}
