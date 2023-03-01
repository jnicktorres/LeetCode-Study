// https://leetcode.com/problems/search-in-rotated-sorted-array

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length == 0){
            return -1;
        }
        
        while(left < right){
            int mid = left + (right -left) /2;
            
            if(nums[mid] > nums[left]){
                left++;
            }
            else if(nums[mid] > nums[left]){
                right--;
            }
            else{
                left = mid;
                break;
            }
        }
        
        int start = left;
        left = 0;
        right = nums.length-1;
        
        if(nums[left] <= target && nums[start] <= target ){
            right = start;
        }
        else if(nums[right] <= target && nums[start] >= target){
            left = start;
        }
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                right = mid-1;
            }
            else{
                left = mid;
            }                
            }

        return -1;
            }
        }   
    