// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
       if (nums == null || nums.length == 0) {
            return -1;
        }
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        Integer minSoFar = nums[0];
        Integer maxSoFar = nums[0];
        Integer result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            Integer num = nums[i];
            if (num > 0) {
                minSoFar = Math.min(num, minSoFar * num);
                maxSoFar = Math.max(num, maxSoFar * num);
            } else if (num < 0) {
                Integer temp = minSoFar;
                minSoFar = Math.min(num, maxSoFar * num);
                maxSoFar = Math.max(num, temp * num);
            } else {
                minSoFar = 0;
                maxSoFar = 0;
            }
            
            result = Math.max(result, maxSoFar);
        }
        
        return result;
    }

}