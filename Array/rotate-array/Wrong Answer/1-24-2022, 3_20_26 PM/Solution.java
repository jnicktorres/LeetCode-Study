// https://leetcode.com/problems/rotate-array

class Solution {
    public void rotate(int[] nums, int k) {
        
                    

        for (int i = nums.length; i > k;i--){
            
            
            for (int j = 0; j < (nums.length - 1);j++){
                int temp = nums[0];
                nums[j] = nums[j + 1];
                nums[j] = temp;
        }
                
    }
        
}
}
    
    
   