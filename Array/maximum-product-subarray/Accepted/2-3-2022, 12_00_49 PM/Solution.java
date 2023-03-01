// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int currprod = 1;
        if(nums.length == 1){
            return max;
        }
        
        for(int i = 0;i<nums.length;i++){
            int currnum = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                
                max = Math.max(currnum,max);
                currnum *= nums[j];
                
                
              
            }
            max = Math.max(currnum,max);
            
        }
        return max;
    }
}



