// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max = 0;
        
        
       while (left <= right){
            int lh = height[left];
            int rh = height[right];
           
           int width = right - left;
           int h = Math.min(lh,rh);
           int area = width * h;
           max = Math.max(max,area);
           
           if(lh < rh){
               left++;
           }
           else if(rh < lh){
               --right;
           }
           else{
               left++;
               right++;
           }
           
       }
        return max;
}
}