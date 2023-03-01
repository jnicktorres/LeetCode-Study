// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int lefth = height[left];
            int righth=height[right];
            int w = right - left;
            int h = Math.min(lefth,righth);
            
            int area  = Math.max(max, w * h);
            max = area;
            
            if(lefth<righth){
                left++;
            }
            else if(lefth>righth){
                right--;
            }
            else{
                left++;
                right--;
            }
            
        }
        
        return max;
    }
}