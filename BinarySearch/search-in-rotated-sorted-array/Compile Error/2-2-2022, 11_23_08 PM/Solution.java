// https://leetcode.com/problems/search-in-rotated-sorted-array

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        
        int left = 0;
        int right = n-1;
        
        while(left < right){
            int mid = left + (right -left) /2;
            if(nums[mid] > nums[right]){
                left = mid +1;
                
            }
            else {
                
                right = mid;
            }
        }
    }
    
    int start = left;
    int left = 0;
    int right = n -1;
    if(target>= nums[start]  target <= nums[right]){
        left = start;
        
    }
    else{
        
        right = start;
    }
    
    
    while(left < right){
            int mid = left + (right -left) /2;
            if(nums[mid] == target){
                
                return mid;
                
            }
            else if(nums[mid] < target){
                
                left = mid +1;
            }
            else {
                
                right = mid -1;
            }
        }
    return -1;
    }
    
}