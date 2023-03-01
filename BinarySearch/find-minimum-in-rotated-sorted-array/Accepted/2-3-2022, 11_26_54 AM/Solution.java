// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = n-1;
        
        
        
        while(left < right){
            int mid = left +(right -left)/2;
            if(nums[mid] > nums[right]){
                left = mid +1;
                
            }
            else{
                right = mid;
            }
        }
     
        int start = left;
        return nums[start];
}
}