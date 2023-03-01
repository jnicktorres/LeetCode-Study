// https://leetcode.com/problems/trapping-rain-water

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int sum = 0;
        
        int l = 0;
        int r= n-1;
        int leftmax = 0;
        int rightmax = 0;
        while(l < r){
            if(height[l] <= height[r]) 
            {
                if(height[l] > leftmax){
                    leftmax = height[l];
                }
                else{
                    sum+= leftmax - height[l];
                }
                l++;
            }
            // if let height is not lower or equal to right, then right must be less
            else{
                if(height[r] > rightmax){
                    rightmax = height[r];
                }
                else{
                    sum+= rightmax - height[r];
                }
                r--;
            
            }
            
        }
        
        
        return sum;
    }
}