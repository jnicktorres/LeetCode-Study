// https://leetcode.com/problems/trapping-rain-water

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int sum = 0;
        
        for(int i =0; i < n; i++){
            int j = i; 
            int left =   Integer.MIN_VALUE;
            int right =  Integer.MIN_VALUE;
            
            while(j >= 0){
                left = Math.max(left, height[j]);
                j--;
            }
            j = i;
            
            while(j<n){
                right = Math.max(right,height[j]);
                j++;
            }
            
            sum += Math.min(left,right) - height[i];
            
        }
        
        return sum;
    }
}