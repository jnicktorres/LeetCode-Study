// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        
      if (nums.length ==0) return 0;
        
        for(int i=j; j < nums.length; i++)
        {
         if (nums[j] != nums[i])   {
            i++;
    nums[i] = nums[j];
             
             }
        }
    return i+1;
        
        }