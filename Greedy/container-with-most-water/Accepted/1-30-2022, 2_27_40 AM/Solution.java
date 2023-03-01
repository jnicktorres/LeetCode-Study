// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max = 0;
        
        while(left < right){
            int lefth = height[left];
            int righth = height[right];
            int h = Math.min(lefth,righth);
            int w = right - left;
            int area = w * h;
            max = Math.max(max,area);
            
            if(lefth<righth) {
                left++;
            }
            else if(righth < lefth){
                right--;
            }
            else{
                right --;
                left++;
            }
        }
        
        return max;
    }
}