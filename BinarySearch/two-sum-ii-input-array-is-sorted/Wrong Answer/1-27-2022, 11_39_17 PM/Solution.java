// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n  = numbers.length;
        int left = numbers[0];
        int right = numbers[n-1];
       
        for(int i = 1; i < n;i++){           
            if (left + right > target)  {
              
              right = numbers[n-1-i];
              if(right == numbers[0]){
                  return new int[]{0,0};
              }
          }
            else if( left + right == target){
               return new int[]{1,n-i + 1};
           }             
            else{
                return new int[]{0,0};
            }
            
        }
        
        return new int[]{0,0};
    }
}


