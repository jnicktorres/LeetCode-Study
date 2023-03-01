// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<= right){
            
            int lefth = height[left];
            int righth = height[right];           
            int w = right - left;
            int area = Math.min(lefth,righth) * w;
            max = Math.max(area,max);
            
            
            if(righth < lefth){
                right--;
            }
            else if (lefth<righth){
                left++;
            }
            else{
                left++;
                right--;
            }
            
        }
        
        
        return max;
        
        
        
    }
}