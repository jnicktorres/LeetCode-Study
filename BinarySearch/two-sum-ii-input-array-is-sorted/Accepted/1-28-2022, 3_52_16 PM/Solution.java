// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        
        
        while(left<=right){
            if(numbers[left] + numbers[right] > target){
                right--;
                
            }
            else if(numbers[left] + numbers[right] == target){
                return new int[]{left+1,right+1};
            }
            
            else{
                left++;
            }
        }
        return new int[]{0,0};
    }
}