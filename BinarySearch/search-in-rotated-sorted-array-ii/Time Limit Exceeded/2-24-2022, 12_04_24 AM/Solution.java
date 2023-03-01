// https://leetcode.com/problems/search-in-rotated-sorted-array-ii

class Solution {
    public boolean search(int[] nums, int target) {
        
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            int mid = left +(right-left)/2;
            
            if(nums[mid] > nums[right]){
                left = mid + 1;          
            }
            else{
               right = mid;
            }       
        }
        
        
        
        
            
        int start = left;
        left = 0;
        right = nums.length - 1;
        
        if(nums[start] == target){
            return true;
        }
        else if(nums[start] < target){
            right = start;
        }
        else{
            left = start;
        }
        
        
        while(left< right){
            int mid = left + (right-left)/2;
             if(nums[mid] == target){
            return true;
        }
        else if(nums[mid] < target){
            right = start;
        }
        else{
            left = start;
        }
    }    
            
            return false;
            
        }
        
    }
