// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int left = 0;
        int right = n -1;
        int max = 0;
        
            while(left < right){
                
                int lefth = height[left];
                int righth = height[right];
                int w = right - left;
                int h = Math.min(lefth, righth);
                int area = w * h;
                
                max = Math.max(area,max);
                
                if(lefth < righth){
                    
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