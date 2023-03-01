// https://leetcode.com/problems/sort-colors

class Solution {
    public void sortColors(int[] nums) {
        
        // This algorithm is O(N) time
        // the bucket algo is O(2N)
        
        int mid = 0;
        int low = 0;
        int high = nums.length-1;
        
        while(mid<= high){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}