// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        
        if(nums.length == 1){
            return nums[0];
        }
        
        
        for(int i = 1;i<nums.length;i++){
            nums[i] = nums[i] * nums[i-1];
            max = Math.max(nums[i],max);
            
        }
        return max;
    }
}