// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i = 0; i < n;i++){
            int currNumber = nums[i];
            for(int j = i+1; j < n;j++){
                max = Math.max(currNumber, max);
                currNumber *= nums[j];
                
            }
            
            max = Math.max(currNumber,max);
        }
        
        return max;
        
    }
}