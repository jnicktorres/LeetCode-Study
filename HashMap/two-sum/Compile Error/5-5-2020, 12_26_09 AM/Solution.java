// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++)  {
          for (int j = 1; j < nums.length; i++) { 
          if (nums[j] == target - nums[i]){
              return new int[i,j];
              
          }
          }
      }
    }
}