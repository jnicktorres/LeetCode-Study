// https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        
        
        for (int left = 0; left < nums.length;left++){
            
            int runningCount = 0; 
            for(int right = left; right < nums.length; right++){
                runningCount += nums[right];
                if(runningCount>maxSum){
                    maxSum = runningCount;
                    start = left;
                    end = right;
                    
                }
            
        }
        }
        return maxSum;
    }
}