// https://leetcode.com/problems/search-in-rotated-sorted-array-ii

class Solution {
    public boolean search(int[] nums, int target) {
        
        
        int start = 0;
        int end = nums.length - 1;
        
     while(start <= end){
        int mid = start + (end - start)/2;
        if(nums[mid] == target) return true;
        
        //if left part is sorted
        if(nums[start] < nums[mid]){
            if(target < nums[start] || target > nums[mid]){
                //target is in rotated part
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }else if(nums[start] > nums[mid]){
            //right part is rotated
            
            //target is in rotated part
            if(target < nums[mid] || target > nums[end]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }else{
            //duplicates, we know nums[mid] != target, so nums[start] != target
            //based on current information, we can only move left pointer to skip one cell
            //thus in the worest case, we would have target: 2, and array like 11111111, then
            //the running time would be O(n)
            start ++;
        }
    }
    }
