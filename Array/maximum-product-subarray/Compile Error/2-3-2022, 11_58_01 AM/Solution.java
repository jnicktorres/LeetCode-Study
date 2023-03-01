// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int currprod = 1;
        if(nums.length == 1){
            return max;
        }
        
        for(int i = 0;i<nums.length;i++){
            int currnum = 1;
            for(int j = i; j < nums.length; j++){
                currnum *= nums[j];
                
                
              
            }
            max = Math.max(currnum,max);
            
        }
        return max;
}
}

[2,3,-2,4]

curr = 2;
curr = 6;
max = 6;
curr = -12;
curr = -48;

