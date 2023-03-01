// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        while(left < right){
            int lefth = height[left];
            int righth = height[right];
            int w = right - left;
            int h = Math.min(lefth,righth);
            
            int area = w *h;
             max = Math.max(max,area);
            
            
            if(lefth<righth){
                left++;
            }
            else if(righth < lefth){
                right--;
            }
            else{
                right--;
                left++;
                
                
            }
            
            
        }
        return max;
        
    }
}