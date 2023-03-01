// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n  = numbers.length;
        int left = numbers[0];
        int right = numbers[n-1];
        int count = 1;
       
        for(int i = 1; i <= n - 1;i++){           
            if (left + right > target)  {
              
              right = numbers[n-1-i];
            }
            else if(left + right < target){
                left = numbers[i];
                count = i;
            }
            
            else if( left + right == target){
               return new int[]{count,n-i + 1};
           }             
            else{
                return new int[]{0,0};
            }
            
        }
        
        return new int[]{0,0};
    }
}


